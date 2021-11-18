package pe.edu.galaxy.training.java.jd0.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AppBDConexion {

	public static void main(String[] args) {
		// Parametros de conexion
		String url 		= "jdbc:oracle:thin:@localhost:1521:xe";
		String driver 	= "";
		String usuario 	= "JD026";
		String clave 	= "123456";

		try {
			Connection cn = DriverManager.getConnection(url, usuario, clave);
			System.out.println("Conexion OK");
			String sql = "SELECT ID_PROVEEDOR,RAZON_SOCIAL,RUC,ESTADO FROM PROVEEDOR";
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				/*
				 * System.out.println(rs.getLong(1)); System.out.println(rs.getString(2));
				 * System.out.println(rs.getString(3)); System.out.println(rs.getString(4));
				 */
				System.out.println(rs.getLong("ID_PROVEEDOR"));
				System.out.println(rs.getString("RAZON_SOCIAL"));
				System.out.println(rs.getString("RUC"));
				System.out.println(rs.getString("ESTADO"));
			}
			
			rs.close();
			st.close();
			cn.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


