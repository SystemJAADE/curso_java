package pe.edu.galaxy.training.java.jd0.dao;

import java.util.List;
import pe.edu.galaxy.training.java.jd0.beans.Fruta;


public interface FrutaDAO {

	List<Fruta> listar();
	List<Fruta> listar(Fruta fruta);

	Boolean insertar(Fruta fruta);

	Boolean actualizar(Fruta fruta);

	Boolean eliminar(Integer codigo);
}
