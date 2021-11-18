package pe.edu.galaxy.training.java.jd0.app;

import java.sql.Connection;
import java.sql.Statement;
import pe.edu.galaxy.training.java.jd0.util.BD;

public class AppBDInsertarStatement {

	public static void main(String[] args) {
		try {
			
			Connection cn =BD.getConnection();
			String sql = "INSERT INTO PROVEEDOR(ID_PROVEEDOR,RAZON_SOCIAL,RUC)" + 
					"VALUES(SEQ_PROVEEDOR.NEXTVAL,'Hermanos Torres','2054987202')";
			Statement st = cn.createStatement();
			st.executeUpdate(sql);

			st.close();
			cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


