package pe.edu.galaxy.training.java.jd0.app;

import pe.edu.galaxy.training.java.jd0.clases.Validador;

public class AppValidador {

	public static void main(String[] args) {
		
		Validador validador= new Validador();
		
		String dni = "x98061698";

		System.out.println(dni + ((validador.dni(dni)) ? " válido" : " inválido"));

	}

}
