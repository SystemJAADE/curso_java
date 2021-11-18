package pe.edu.galaxy.training.java.jd0.app;


import java.util.List;
import pe.edu.galaxy.training.java.jd0.beans.Proveedor;
import pe.edu.galaxy.training.java.jd0.dao.ProveedorDAO;

public class AppProveedor {

	public static void main(String[] args) {
		
		//insertar();
		//actualizar();
		eliminar();
		listar();
		
	}
	
	private static void listar() {
		try {
			
			ProveedorDAO proveedorDAO= new ProveedorDAO();
			List<Proveedor> proveedores=proveedorDAO.listar();
			proveedores.forEach(System.out::println);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void insertar() {
		try {
			
			ProveedorDAO proveedorDAO= new ProveedorDAO();
			
			Proveedor proveedor= new Proveedor();
			proveedor.setRazonSocial("Heramanos Trinidad");
			proveedor.setRuc("10544987255");
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
			
			ProveedorDAO proveedorDAO= new ProveedorDAO();
			
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
			
			ProveedorDAO proveedorDAO= new ProveedorDAO();
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


