package pe.edu.galaxy.training.java.app;

import java.util.ArrayList;
import java.util.List;

import pe.edu.galaxy.training.java.beans.Producto;

public class AppProductos {

	public static void main(String[] args) {

		// Clase objeto Constructor
		Producto producto = new Producto();

		// Colección

		List<Producto> productos = new ArrayList<>();

		producto.setCodigo(100L);
		producto.setNombre("Proyector ViewSonic");
		producto.setPrecio(1500.00);
		producto.setStock(8);
		producto.setActivo(true);

		productos.add(producto);

		Producto producto2 = new Producto(200L, "Aire Acondicionado LENOX", 2300.75, 4,true);

		productos.add(producto2);

		productos.add(new Producto(300L, "ASUS VivoBook Pro", 4200.00, 4,true));

		// Tradicional

		for (int i = 0; i < productos.size(); i++) {
			System.out.println(productos.get(i));
		}

		System.out.println();

		// For each
		for (Producto obj : productos) {
			System.out.println(obj);
		}

		System.out.println();
		// Lamda Expressions

		productos.forEach(System.out::println);

		System.out.println();

		// For each
		for (Producto obj : productos) {
			if (obj.getPrecio() > 1500) {
				System.out.println(obj);
			}

		}

		System.out.println();

		productos.forEach(p -> {
			if (p.getPrecio() > 1500) {
				System.out.println(p);
			}
		});
		
		System.out.println("...");

		productos.forEach(p -> {
			if (p.getPrecio() <= 1500 && p.isActivo()) {
				System.out.println(p);
			}
		});
		

	}

}












