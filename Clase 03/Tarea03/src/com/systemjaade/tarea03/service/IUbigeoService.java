package com.systemjaade.tarea03.service;

import com.systemjaade.tarea03.model.Ubigeo;
import java.util.List;

/**
 *
 * @author elitg
 */
public interface IUbigeoService {

  List<Ubigeo> getDepartamento();

  List<Ubigeo> getProvincia(String departamentoId);

  List<Ubigeo> getDistrito(String departamentoId, String provinciaId);
}
