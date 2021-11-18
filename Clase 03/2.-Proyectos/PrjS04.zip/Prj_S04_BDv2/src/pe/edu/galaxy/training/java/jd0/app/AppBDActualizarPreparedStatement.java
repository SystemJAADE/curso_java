package pe.edu.galaxy.training.java.jd0.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import pe.edu.galaxy.training.java.jd0.util.BD;

public class AppBDActualizarPreparedStatement {

	public static void main(String[] args) {
		try {
			
			Connection cn =BD.getConnection();
			String sql = "UPDATE PROVEEDOR SET  RAZON_SOCIAL=?,RUC=? WHERE ID_PROVEEDOR=?";
			
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1, "Hermanos NovoaXX");
			ps.setString(2, "20544887823");
			ps.setLong(3, 7);
			ps.executeUpdate();

			ps.close();
			cn.close();
			System.out.println("Actualización ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


