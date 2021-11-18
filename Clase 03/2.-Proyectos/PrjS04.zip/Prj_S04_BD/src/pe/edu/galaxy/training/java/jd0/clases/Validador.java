package pe.edu.galaxy.training.java.jd0.clases;

public class Validador {

	public  boolean dni(String dni) {

		if (dni.length() != 8) {
			System.out.println("El dni debe tener 8 dígitos, usted ingresó " + dni.length() + " dígitos");
			return false;
		}
		
		for (int i = 0; i < dni.length(); i++) {
			if (!Character.isDigit(dni.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public  boolean ruc(String dni) {
		/*
		 *  Debe tener 11 digitos  y comenzar con 20,10 o 17
		 */
		return false;
	}

	public  boolean correo(String dni) {
		/*
		 * Deber tener dominio,@ y sin caracteres especiales 
		 */
		return false;
	}

	public  boolean clave(String dni) {
		/*
		 * Minimo 8 carateres, numeros, letras mayuscuals y minusculas, especiales (%$#@+.-(*&)
		 */
		return false;
	}
}
