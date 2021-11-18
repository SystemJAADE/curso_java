package pe.edu.galaxy.training.java.jd0.app;

import java.util.ArrayList;
import java.util.List;
import pe.edu.galaxy.training.java.jd0.beans.Provedor;

public class AppProvedores {

	public static void main(String[] args) {
		// Coleccion
		List<Provedor> provedores = new ArrayList<>();
		provedores.add(new Provedor(100, "Productos Amazonences", "2054987254"));
		provedores.add(new Provedor(200, "Inversiones la Cruz", "1054987200"));

		provedores.forEach(System.out::println);
	}

}
