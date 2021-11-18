package pe.edu.galaxy.training.java.jd0.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import pe.edu.galaxy.training.java.jd0.util.BD;

public class AppBDSeleccionarPreparedStatent {

	public static void main(String[] args) {

		try {
			Connection cn = BD.getConnection();
			String sql = "SELECT ID_PROVEEDOR,RAZON_SOCIAL,RUC,ESTADO FROM PROVEEDOR WHERE ESTADO='1'";
			PreparedStatement ps = cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getLong("ID_PROVEEDOR"));
				System.out.println(rs.getString("RAZON_SOCIAL"));
				System.out.println(rs.getString("RUC"));
				System.out.println(rs.getString("ESTADO"));
			}
			rs.close();
			ps.close();
			cn.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


