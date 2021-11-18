package pe.edu.galaxy.training.java.jd0.dao;

import java.util.List;
import pe.edu.galaxy.training.java.jd0.beans.Proveedor;

public interface ProveedorDAO {

	List<Proveedor> listar();

	Boolean insertar(Proveedor proveedor);

	Boolean actualizar(Proveedor proveedor);

	Boolean eliminar(Integer codigo);
}
