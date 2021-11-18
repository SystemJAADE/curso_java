package pe.edu.galaxy.training.java.jd0.app;

import pe.edu.galaxy.training.java.jd0.clases.ValidadorUtil;

public class AppValidadorUtil {

	public static void main(String[] args) {
		
		//ValidadorUtil validadorUtil= new ValidadorUtil();
		
		String dni = "x98061698";

		System.out.println(dni + ((ValidadorUtil.dni(dni)) ? " válido" : " inválido"));

	}

}
