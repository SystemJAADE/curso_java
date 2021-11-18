package pe.edu.galaxy.training.java.jd0.app;


import java.util.List;
import pe.edu.galaxy.training.java.jd0.beans.Proveedor;
import pe.edu.galaxy.training.java.jd0.dao.ProveedorDAO;
import pe.edu.galaxy.training.java.jd0.dao.impl.oracle.ProveedorDAOImpl;

public class AppProveedor {
	
	private static ProveedorDAO proveedorDAO= new ProveedorDAOImpl();

	public static void main(String[] args) {
		
		insertar();
		//actualizar();
		//eliminar();
		listar();
		
	}
	
	private static void listar() {
		try {
			List<Proveedor> proveedores=proveedorDAO.listar();
			proveedores.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void insertar() {
		try {
			Proveedor proveedor= new Proveedor();
			proveedor.setRazonSocial("Heramanos Trinidad 21");
			proveedor.setRuc("10544987258");
			if (proveedorDAO.insertar(proveedor)) {
				System.out.println("Exito de inserción");
			} else {
				System.out.println("Error de inserción");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void actualizar() {
		try {
			Proveedor proveedor= new Proveedor();
			proveedor.setCodigo(9);
			proveedor.setRazonSocial("Consorcio Heramanos Trinidad S.A.");
			proveedor.setRuc("10544987257");
			if (proveedorDAO.actualizar(proveedor)) {
				System.out.println("Exito de actualización");
			} else {
				System.out.println("Error de actualización");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void eliminar() {
		try {
			if (proveedorDAO.eliminar(9)) {
				System.out.println("Exito de eliminación");
			} else {
				System.out.println("Error de eliminación");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


