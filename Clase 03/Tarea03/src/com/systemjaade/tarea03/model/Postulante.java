package com.systemjaade.tarea03.model;

import java.util.Date;

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

  public Postulante() {
  }

  public Postulante(int postulanteId, String nombres, String apellidoPaterno, String apellidoMaterno, String numeroDni, Date fechaNacimiento, String telefonoFijo, String telefonoCelular, String correoElectronico, Boolean sexo, String direccion, String ubigeoId) {
    this.postulanteId = postulanteId;
    this.nombres = nombres;
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
    this.numeroDni = numeroDni;
    this.fechaNacimiento = fechaNacimiento;
    this.telefonoFijo = telefonoFijo;
    this.telefonoCelular = telefonoCelular;
    this.correoElectronico = correoElectronico;
    this.sexo = sexo;
    this.direccion = direccion;
    this.ubigeoId = ubigeoId;
  }

  public int getPostulanteId() {
    return postulanteId;
  }

  public void setPostulanteId(int postulanteId) {
    this.postulanteId = postulanteId;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  public String getNumeroDni() {
    return numeroDni;
  }

  public void setNumeroDni(String numeroDni) {
    this.numeroDni = numeroDni;
  }

  public Date getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(Date fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public String getTelefonoFijo() {
    return telefonoFijo;
  }

  public void setTelefonoFijo(String telefonoFijo) {
    this.telefonoFijo = telefonoFijo;
  }

  public String getTelefonoCelular() {
    return telefonoCelular;
  }

  public void setTelefonoCelular(String telefonoCelular) {
    this.telefonoCelular = telefonoCelular;
  }

  public String getCorreoElectronico() {
    return correoElectronico;
  }

  public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
  }

  public Boolean isSexo() {
    return sexo;
  }

  public void setSexo(Boolean sexo) {
    this.sexo = sexo;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getUbigeoId() {
    return ubigeoId;
  }

  public void setUbigeoId(String ubigeoId) {
    this.ubigeoId = ubigeoId;
  }

  @Override
  public String toString() {
    return "Postulante{" + "postulanteId=" + postulanteId + ", nombres=" + nombres + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", numeroDni=" + numeroDni + ", fechaNacimiento=" + fechaNacimiento + ", telefonoFijo=" + telefonoFijo + ", telefonoCelular=" + telefonoCelular + ", correoElectronico=" + correoElectronico + ", sexo=" + sexo + ", direccion=" + direccion + ", ubigeoId=" + ubigeoId + '}';
  }

}
