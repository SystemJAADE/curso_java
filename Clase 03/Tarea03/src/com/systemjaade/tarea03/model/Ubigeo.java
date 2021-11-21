package com.systemjaade.tarea03.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Ubigeo {

  private String ubigeoId;
  private String departamentoId;
  private String departamento;
  private String provinciaId;
  private String provincia;
  private String distritoId;
  private String distrito;

}
