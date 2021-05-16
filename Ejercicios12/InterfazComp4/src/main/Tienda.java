package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tienda {

	private ArrayList<Articulo> articulos;
	private Scanner scan = new Scanner(System.in);

	public Tienda() {
		this.articulos = new ArrayList<>();
	}

	public Tienda(ArrayList<Articulo> articulos) {
		this.articulos = new ArrayList<>();
	}

	public void rellenar() {

		String respuesta = null;
		do {
			System.out.println("Que deseas crear:");
			System.out.println("1. Pelicula");
			System.out.println("2. Videojuego");
			int menu = scan.nextInt();
			if (menu == 1) {
				Pelicula pelicula = new Pelicula();
				pelicula.rellenar();
				articulos.add(pelicula);
			}
			if (menu == 2) {
				Videojuego videojuego = new Videojuego();
				videojuego.rellenar();
				articulos.add(videojuego);
			}

			System.out.println("Deseas continuar?(si/no)");
			respuesta = scan.next();
		} while (respuesta.equalsIgnoreCase("si"));

	}

	public void visualizar() {

		for (Articulo articulo : articulos) {
			if (articulo.getClass().getSimpleName().equals("Pelicula")) {
				System.out.println();
				System.out.println("Pelicula: ");
				System.out.println();
			}
			if (articulo.getClass().getSimpleName().equals("Videojuego")) {
				System.out.println();
				System.out.println("Videojuego: ");
				System.out.println();
			}
			articulo.visualizar();
		}

	}

	public void ordenar() {

		Collections.sort(articulos);

	}

	public void crearBase() {

		Connection con = null;
		try {

			/*** Driver ****/

			Class.forName("com.mysql.jdbc.Driver");

			/*** Conexión BBDD ***/

			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/prueba", "root", "");

			/***** Definir sentencia y ejecutarla ********/
			Statement sentencia = null;
			for (Articulo articulo : articulos) {
				if (articulo.getClass().getSimpleName().equals("Pelicula")) {
					sentencia = con.createStatement();
					sentencia.executeUpdate("INSERT INTO pelicula values(" + articulo.valores() + ");");
				}
				if (articulo.getClass().getSimpleName().equals("Videojuego")) {
					sentencia = con.createStatement();
					sentencia.executeUpdate("INSERT INTO videojuegos values(" + articulo.valores() + ");");
				}
			}
			sentencia.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		/*** Cerrar la conexión ***/

		finally {
			cerrar_conexion(con);
		}
	}

	public void visualizarBase() {

		Connection con = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/prueba", "root", "");

			/***** Definir sentencia y ejecutarla ********/

			Statement sentencia = con.createStatement();
			String orden_SQL = "";
			int menu = 0;
			do {
				System.out.println("Que deseas visualizar:");
				System.out.println("1. Peliculas");
				System.out.println("2. Videojuegos");
				menu = scan.nextInt();
				if (menu == 1) {
					orden_SQL = "SELECT * FROM pelicula";

				}
				if (menu == 2) {
					orden_SQL = "SELECT * FROM videojuegos";
				}
			} while (menu != 1 && menu != 2);

			ResultSet rs = sentencia.executeQuery(orden_SQL);

			/*** Recorrer fila a fila todo el resultado ****/

			if (menu == 1) {
				while (rs.next()) {
					System.out.println();
					System.out.println("\n TITULO: "
						+ rs.getString("titulo") + "\n ISBN: "
						+ rs.getString("isbn")+"\n PRECIO: "
						+ rs.getString("precio")+"\n DURACION: "
						+ rs.getString("duracion")+"\n PRECIO FINAL: "
						+ rs.getString("precio_final")+". ");
				}
			}
			if (menu == 2) {
				while (rs.next()) {
					System.out.println();
					System.out.println("\n TITULO: "
						+ rs.getString("titulo") + "\n ISBN: "
						+ rs.getString("isbn")+"\n PRECIO: "
						+ rs.getString("precio")+"\n PLATAFORMA: "
						+ rs.getString("plataforma")+"\n DESCRIPCION: "
						+ rs.getString("descripcion")+"\n FABRICANTE: "
						+ rs.getString("fabricante")+"\n ONLINE: "
						+ rs.getString("esonline")+"\n PRECIO FINAL: "
						+ rs.getString("precio_final"));
				}
			}
			
			

			sentencia.close();
		} catch (

		ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		/*** Haya excepción o no, tengo que cerrar la conexión ***/

		finally {
			cerrar_conexion(con);
		}

	}

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
