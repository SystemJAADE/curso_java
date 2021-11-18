package pe.edu.galaxy.training.java.jd0.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD {
	private static String url 		= "jdbc:oracle:thin:@localhost:1521:xe";
	private static String driver 	= "";
	private static String usuario 	= "JD026";
	private static String clave 	= "123456";
	
	public static Connection getConnection() throws SQLException{
		try {
			Connection cn = DriverManager.getConnection(url, usuario, clave);
			return cn;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SQLException(e);
		}
	}
}
