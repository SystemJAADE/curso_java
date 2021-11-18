package pe.edu.galaxy.training.java.jd0.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import pe.edu.galaxy.training.java.jd0.util.BD;

public class AppBDEliminarLogicoPreparedStatement {

	public static void main(String[] args) {
		try {
			
			Connection cn =BD.getConnection();
			String sql = "UPDATE PROVEEDOR SET ESTADO='0' WHERE ID_PROVEEDOR=?";
			
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setLong(1, 5);
			ps.executeUpdate();

			ps.close();
			cn.close();
			System.out.println("Eliminación ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


