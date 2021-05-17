package objetos;

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

/**
 * Clase Database
 * 
 * @author Jaime
 * @version
 * @since 1.8
 */

public class Database {

	static Scanner scan = new Scanner(System.in);

	public static void crearBase() {

		String orden_sql = "CREATE DATABASE IF NOT EXISTS restaurantejaime";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost", "root", "");
				PreparedStatement st = conn.prepareStatement(orden_sql)) {
			st.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Properties usarBase() {

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

	public static Connection crearConexion(Properties p) {

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

	public static void createTable(Connection c) {

		try {
			String orden1 = "DROP TABLE IF EXISTS mesa_plato";
			String orden2 = "CREATE TABLE mesa_plato(mesa int,pedido int,extra varchar(25));";
			PreparedStatement sentencia = c.prepareStatement(orden1);
			sentencia.execute(orden1);
			sentencia = c.prepareStatement(orden2);
			sentencia.execute(orden2);

			sentencia.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		crearMenu(c);

	}

	private static void crearMenu(Connection c) {

		try {
			String orden1 = "DROP TABLE IF EXISTS menu";
			String orden2 = "CREATE TABLE menu(id int,nombre varchar(25),precio int);";
			String orden3 = "INSERT INTO menu VALUES (1,'Agua',1),(2,'CocaCola',2),(3,'Fanta',2),(4,'Cerveza',3),(5,'Vino',4),(6,'Paella',20),(7,'Arroz con bogavante',18),(8,'Chuletas de cordero',14),(9,'Solomillo de cerdo',12),(10,'Entrecot de ternera',15),(11,'Pechuga de pollo',10),(12,'Pollo frito con ajos',12),(13,'Ensalada normal',7),(14,'Ensaladilla rusa',8),(15,'Merluza a la plancha',15),(16,'Salmon a la plancha',14),(17,'Canelones',10),(18,'Migas con jamon',9),(19,'Sopa de ajo',6),(20,'Gambas a la plancha',15),(21,'Huevos rotos',12),(22,'Esparragos',13),(23,'Croquetas',9),(24,'Morcilla con patatas',10),(25,'Cafe',1),(26,'Natillas',2),(27,'Tarta de chocolate',2),(28,'Flan',3),(29,'Coulant de chocolate',4),(30,'Crema catalana',4);";

			PreparedStatement sentencia = c.prepareStatement(orden1);
			sentencia.execute(orden1);
			sentencia = c.prepareStatement(orden2);
			sentencia.execute(orden2);
			sentencia = c.prepareStatement(orden3);
			sentencia.execute(orden3);

			sentencia.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void addData(Connection c, int mesa, int pedido, String extra) {

		try {
			String orden_SQL = "INSERT INTO mesa_plato values(?,?,?);";
			PreparedStatement sentencia = c.prepareStatement(orden_SQL);
			sentencia.setInt(1, mesa);
			sentencia.setInt(2, pedido);
			sentencia.setString(3, extra);
			sentencia.execute();

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

	public static void delete(Connection c) {

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

	public static String getNombrePlato(int numPlato) {

		Properties p = usarBase();
		Connection c = crearConexion(p);

		String nombrePlato = "";

		try {

			String orden_SQL = "SELECT nombre FROM menu WHERE id=" + numPlato + ";";
			Statement sentencia = c.createStatement();
			ResultSet rs = sentencia.executeQuery(orden_SQL);

			if (rs.next()) {

				nombrePlato = rs.getString(1);

			}

			sentencia.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return nombrePlato;
	}

	public static double getPrecioPlato(int numPlato) {

		Properties p = usarBase();
		Connection c = crearConexion(p);

		double precioPlato = 0;

		try {

			String orden_SQL = "SELECT precio FROM menu WHERE id=" + numPlato + ";";
			Statement sentencia = c.createStatement();
			ResultSet rs = sentencia.executeQuery(orden_SQL);

			if (rs.next()) {

				precioPlato = rs.getInt(1);

			}

			sentencia.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return precioPlato;

	}

}
