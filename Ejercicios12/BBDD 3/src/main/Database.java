package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Database {

	private Scanner scan = new Scanner(System.in);

	public Properties usarBase() {

		FileInputStream f = null;
		try {
			f = new FileInputStream("config/datos.properties");
		} catch (FileNotFoundException e1) {
			System.out.println("No se ha encontrado el archivo de configuracion");
		}

		Properties p = new Properties();
		try {
			p.load(f);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		return p;

	}

	public Connection crearConexion(Properties p) {

		Connection conexion = null;
		try {

			/*** Driver ****/

			Class.forName("com.mysql.jdbc.Driver");

			/*** Conexión BBDD ***/

			conexion = DriverManager.getConnection(
					"jdbc:mysql://" + p.getProperty("server.name") + ":" + p.getProperty("server.port") + "/"
							+ p.getProperty("server.database"),
					p.getProperty("server.username"), p.getProperty("server.password"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conexion;
	}

	public void createTable(Connection c) {

		try {
			/***** Definir sentencia y ejecutarla ********/

			String orden1 = "DROP TABLE alumnos";
			String orden2 = "CREATE TABLE alumnos(nombre varchar(25),nota int);";
			PreparedStatement sentencia = c.prepareStatement(orden1);
			sentencia.execute(orden1);
			sentencia = c.prepareStatement(orden2);
			sentencia.execute(orden2);

			sentencia.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("**Tabla creada**");

	}

	public void addData(Connection c) {

		try {

			System.out.println("Introduce el nombre: ");
			String nombre = scan.next();
			System.out.println("Introduce la nota: ");
			int nota = scan.nextInt();

			String orden_SQL = "INSERT INTO alumnos values(?,?);";
			PreparedStatement sentencia = c.prepareStatement(orden_SQL);
			sentencia.setString(1, nombre);
			sentencia.setInt(2, nota);
			sentencia.executeUpdate();

			sentencia.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void visualizar(Connection c) {

		try {

			String orden_SQL = "SELECT * FROM alumnos;";
			Statement sentencia = c.createStatement();
			ResultSet rs = sentencia.executeQuery(orden_SQL);

			while (rs.next()) {
				System.out.println();
				System.out.println("1.Nombre: " + rs.getString(1));
				System.out.println("2.Nota: " + rs.getInt(2));
			}

			sentencia.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void modificar(Connection c) {

		System.out.println("Que quieres modificar?");
		System.out.println("Nombre");
		System.out.println("Nota");
		int opcion = scan.nextInt();
		if (opcion == 1) {
			modificarNombre(c);
		}
		if (opcion == 2) {
			modificarNota(c);
		}
	}

	public void modificarNombre(Connection c) {

		System.out.println("Introduce el nombre a buscar:");
		String nombre = scan.next();
		boolean encontrado = false;

		try {

			String orden_SQL = "SELECT * FROM alumnos;";
			Statement sentencia = c.createStatement();
			ResultSet rs = sentencia.executeQuery(orden_SQL);

			while (rs.next()) {
				if (rs.getString("nombre").equalsIgnoreCase(nombre)) {
					encontrado = true;
				}
			}

			sentencia.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (encontrado) {
			try {
				System.out.println("Introduce el nuevo nombre: ");
				String nuevoNombre = scan.next();
				String orden_SQL = "UPDATE alumnos SET nombre='" + nuevoNombre + "' WHERE nombre='" + nombre + "'";
				Statement sentencia = c.createStatement();
				sentencia.executeUpdate(orden_SQL);

				sentencia.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("No se han encontrado coincidencias");
		}

	}

	private void modificarNota(Connection c) {

		System.out.println("Introduce el nombre a buscar:");
		String nombre = scan.next();
		boolean encontrado = false;

		try {

			String orden_SQL = "SELECT * FROM alumnos;";
			Statement sentencia = c.createStatement();
			ResultSet rs = sentencia.executeQuery(orden_SQL);

			while (rs.next()) {
				if (rs.getString("nombre").equalsIgnoreCase(nombre)) {
					System.out.println("La nota es: " + rs.getInt("nota"));
					encontrado = true;
				}
			}

			sentencia.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (encontrado) {
			try {
				System.out.println("Introduce la nueva nota: ");
				int nuevaNota = scan.nextInt();
				String orden_SQL = "UPDATE alumnos SET nota='" + nuevaNota + "' WHERE nombre='" + nombre + "'";
				Statement sentencia = c.createStatement();
				sentencia.executeUpdate(orden_SQL);

				sentencia.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("No se han encontrado coincidencias");
		}

	}

	public void delete(Connection c) {

		System.out.println("Que nombre quieres eliminar?:");
		String nombre = scan.next();
		boolean encontrado = false;

		try {

			String orden_SQL = "SELECT * FROM alumnos;";
			Statement sentencia = c.createStatement();
			ResultSet rs = sentencia.executeQuery(orden_SQL);

			while (rs.next()) {
				if (rs.getString("nombre").equalsIgnoreCase(nombre)) {
					encontrado = true;
				}
			}

			sentencia.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (encontrado) {
			try {
				String orden_SQL = "DELETE FROM ALUMNOS WHERE nombre=?;";
				PreparedStatement sentencia = c.prepareStatement(orden_SQL);
				sentencia.setString(1, nombre);
				sentencia.executeUpdate();

				sentencia.close();
				System.out.println("El alumno " + nombre + " se ha eliminado");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("No se han encontrado coincidencias");
		}

	}

	public static void cerrar_conexion(Connection conexion) {
		try {
			if (conexion != null) {
				if (!conexion.isClosed()) {
					conexion.close();
				}
			}
		} catch (SQLException e) {
			System.out.println("No se ha podido cerrar la conexion");
		}
	}

}
