package pe.edu.galaxy.training.java.jd0.app;

import java.util.ArrayList;
import java.util.List;

import pe.edu.galaxy.training.java.jd0.beans.Fruta;

public class AppFrutaMejorado {


	public static void main(String[] args) {
	
		// Clase objeto	 constructor
		Fruta fruta= new Fruta();
		fruta.setCodigo(100);
		fruta.setNombre("Papaya");
		fruta.setPrecio(5.00);
		fruta.setCantidad(2);
		
		System.out.println(fruta.getCodigo());
		System.out.println(fruta.getNombre());
		
		Fruta fruta1= new Fruta(200, "Naranja");
		fruta1.setPrecio(10.00);
		fruta1.setCantidad(4);
		
		System.out.println(fruta1);
		
		// Coleccion
		List<Fruta> frutas= new ArrayList<>();
		frutas.add(fruta);
		frutas.add(fruta1);
		frutas.add(new Fruta(300, "Piña", 15.0,3));

		frutas.forEach(System.out::println);
	}

}
