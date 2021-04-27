package rs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class rs_desplazamiento {
	/**** Columnas del ResultSet ****/
	static String col1 = "codigo";
	static String col2 = "nombre";

	public static void main(String[] args) {
		Connection con = null;
		try {

			/*** Driver ****/

			Class.forName("com.mysql.jdbc.Driver");

			/*** Conexión BBDD ***/

			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/prueba", "root", "");

			/***** Definir sentencia y ejecutarla ********/

			String orden_SQL = "SELECT " + col1 + "," + col2 + " FROM cliente ORDER BY " + col2;
			Statement sentencia = con.createStatement();
			ResultSet rs = sentencia.executeQuery(orden_SQL);

			/*** Recorrer fila a fila todo el resultado ****/

			while (rs.next()) {
				System.out.println(rs.getString(col1) + ", " + rs.getString(col2));
			}

			sentencia.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		/*** Haya excepción o no, tengo que cerrar la conexión ***/

		finally {
			cerrar_conexion(con);
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
