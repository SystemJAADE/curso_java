package pe.edu.galaxy.training.java.jd0.app;

import java.util.ArrayList;
import java.util.List;

import pe.edu.galaxy.training.java.jd0.beans.Fruta;

public class AppFruta {


	public static void main(String[] args) {
	
		// Clase objeto	 constructor
		Fruta fruta= new Fruta();
		fruta.setCodigo(100);
		fruta.setNombre("Papaya");
		
		System.out.println(fruta.getCodigo());
		System.out.println(fruta.getNombre());
		
		Fruta fruta1= new Fruta(200, "Naranja");
		
		
		// Coleccion
		List<Fruta> frutas= new ArrayList<>();
		frutas.add(fruta);
		frutas.add(fruta1);
		frutas.add(new Fruta(300, "Piña"));

		frutas.forEach(System.out::println);
	}

}
