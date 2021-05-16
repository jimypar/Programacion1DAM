package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
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
		
		Connection conexion = null;
		try {

			/*** Driver ****/

			Class.forName("com.mysql.jdbc.Driver");

			/*** Conexión BBDD ***/
		

			conexion = DriverManager.getConnection("jdbc:mysql://"+p.getProperty("server.name")+":"
			+p.getProperty("server.port")+"/"+p.getProperty("server.database"),p.getProperty("server.username"),p.getProperty("server.password"));

			/***** Definir sentencia y ejecutarla ********/

			String orden_SQL = "SELECT * FROM pelicula";
			Statement sentencia = conexion.createStatement();
			ResultSet rs = sentencia.executeQuery(orden_SQL);
			/*** Recorrer fila a fila todo el resultado ****/

			while (rs.next()) {
				System.out.println(rs.getString("titulo"));
			}

			sentencia.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		/*** Haya excepción o no, tengo que cerrar la conexión ***/

		finally {
			cerrar_conexion(conexion);
		}
	}

	/********************************************************************
	 * Me aseguro de que se cierra la conexión
	 ********************************************************************/
	public static void cerrar_conexion(Connection con) {
		try {
			if (con != null) {
				if (!con.isClosed()) {
					con.close();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
