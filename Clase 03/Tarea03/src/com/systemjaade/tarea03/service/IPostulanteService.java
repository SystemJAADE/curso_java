package com.systemjaade.tarea03.service;

import com.systemjaade.tarea03.model.Postulante;
import java.util.List;

/**
 *
 * @author elitg
 */
public interface IPostulanteService {

  void registrar(Postulante postulante);

  void modificar(Postulante postulante);

  void eliminar(Postulante postulante);

  Postulante getPostulante(int postulanteId);

  List<Postulante> getLista();

  Postulante getByNumeroDni(String numeroDni);
}
