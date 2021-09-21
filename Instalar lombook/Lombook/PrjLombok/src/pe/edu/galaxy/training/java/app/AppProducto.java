package pe.edu.galaxy.training.java.app;

import pe.edu.galaxy.training.java.beans.Producto;

public class AppProducto {

	public static void main(String[] args) {
		
		//Clase  objeto        Constructor
		Producto producto= new Producto();
		
		producto.setCodigo(100L);
		producto.setNombre("Proyector ViewSonic");
		producto.setPrecio(1500.00);
		producto.setStock(8);
		System.out.println(	producto.getCodigo() +  " " 
							+ producto.getNombre()+  " " 
							+ producto.getPrecio()+  " "
							+ producto.getStock());
		
		System.out.println(producto);
		
		Producto producto2= new Producto(200L, "Aire Acondicionado LENOX", 2300.75,4,true);
		
		System.out.println(producto2);
		
		System.out.println(new Producto(300L, "ASUS VivoBook Pro", 4200.00,4,true));
		
		
	}

}
