package pe.edu.galaxy.training.java.jd0.dao;

import java.sql.SQLException;
import java.util.List;

public interface GenericoDAO<T> {

	List<T> listar() throws SQLException;

	List<T> listar(T t) throws SQLException;

	Boolean insertar(T t) throws SQLException;

	Boolean actualizar(T t) throws SQLException;

	Boolean eliminar(Integer codigo) throws SQLException;
}
