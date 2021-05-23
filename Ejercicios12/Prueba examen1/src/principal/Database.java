package principal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class Database {

	private Connection c;

	public void crearConexion() {

		FileInputStream f = null;
		try {
			f = new FileInputStream("config/config.properties");
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
			e.printStackTrace();
		}

		Properties p = new Properties();
		try {
			p.load(f);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			Class.forName("com.mysql.jdbc.Driver");

			c = DriverManager.getConnection(
					"jdbc:mysql://" + p.getProperty("server.name") + ":" + p.getProperty("server.port") + "/"
							+ p.getProperty("server.database"),
					p.getProperty("server.user"), p.getProperty("server.password"));

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void crearTablas() {

		try {
			String orden1 = "CREATE TABLE IF NOT EXISTS bebida (descripcion varchar(25),precio int,tipo varchar(25));";
			String orden2 = "CREATE TABLE IF NOT EXISTS comida (descripcion varchar(25),precio int,tipo varchar(25));";

			PreparedStatement st = c.prepareStatement(orden1);
			st.executeUpdate(orden1);
			st = c.prepareStatement(orden2);
			st.executeUpdate(orden2);
			
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void insertarDato(String descripcion, double precio, String tipo) {
		
		try {
			String orden = "INSERT INTO bebida values(?,?,?)";

			PreparedStatement st = c.prepareStatement(orden);
			st.setString(1,descripcion);
			st.setDouble(2,precio);
			st.setString(3,tipo);
			st.execute();
			
			st.close();
		} catch (SQLException e) {
			
		}
		
	}
	
	public void actualizarPrecio() {
		
		try {
			String orden = "UPDATE bebida set precio = precio*1.2 where tipo = 'SINALCOHOL';";
			
			PreparedStatement st = c.prepareStatement(orden);
			st.execute(orden);
			
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void visualizarComida(int num) {
		
		try {
			String orden = "SELECT * FROM pruebaexamen1.comida WHERE precio>?;";
			
			PreparedStatement st = c.prepareStatement(orden);
			st.setInt(1,num);
			st.execute(orden);
			
			st.close();			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
