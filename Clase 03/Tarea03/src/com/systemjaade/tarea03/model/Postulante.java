package com.systemjaade.tarea03.model;

import java.util.Date;
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
public class Postulante {

  private int postulanteId;
  private String nombres;
  private String apellidoPaterno;
  private String apellidoMaterno;
  private String numeroDni;
  private Date fechaNacimiento;
  private String telefonoFijo;
  private String telefonoCelular;
  private String correoElectronico;
  private Boolean sexo;
  private String direccion;
  private String ubigeoId;

}
