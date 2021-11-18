package pe.edu.galaxy.training.java.jd0.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AppBDInsertar {

	public static void main(String[] args) {
		// Parametros de conexion
		String url 		= "jdbc:oracle:thin:@localhost:1521:xe";
		String driver 	= "";
		String usuario 	= "JD026";
		String clave 	= "123456";

		try {
			
			Connection cn = DriverManager.getConnection(url, usuario, clave);
			System.out.println("Conexion OK");
			String sql = "INSERT INTO PROVEEDOR(ID_PROVEEDOR,RAZON_SOCIAL,RUC)" + 
					"VALUES(SEQ_PROVEEDOR.NEXTVAL,'Hermanos García','2054987201')";
			Statement st = cn.createStatement();
			st.executeUpdate(sql);

			st.close();
			cn.close();
			System.out.println("Inserción OK");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


