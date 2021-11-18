package pe.edu.galaxy.training.java.jd0.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import pe.edu.galaxy.training.java.jd0.util.BD;

public class AppBDInsertarPreparedStatement {

	public static void main(String[] args) {
		try {
			
			Connection cn =BD.getConnection();
			String sql = "INSERT INTO PROVEEDOR(ID_PROVEEDOR,RAZON_SOCIAL,RUC)" + 
					"VALUES(SEQ_PROVEEDOR.NEXTVAL,?,?)";
			
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1, "Hermanos Novoa");
			ps.setString(2, "20544887823");
			
			ps.executeUpdate();

			ps.close();
			cn.close();
			System.out.println("Actualización ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


