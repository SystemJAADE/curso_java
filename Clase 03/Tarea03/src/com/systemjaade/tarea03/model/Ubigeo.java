package com.systemjaade.tarea03.model;

public class Ubigeo {

  private String ubigeoId;
  private String departamentoId;
  private String departamento;
  private String provinciaId;
  private String provincia;
  private String distritoId;
  private String distrito;

  public Ubigeo() {
  }

  public String getUbigeoId() {
    return ubigeoId;
  }

  public void setUbigeoId(String ubigeoId) {
    this.ubigeoId = ubigeoId;
  }

  public String getDepartamentoId() {
    return departamentoId;
  }

  public void setDepartamentoId(String departamentoId) {
    this.departamentoId = departamentoId;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  public String getProvinciaId() {
    return provinciaId;
  }

  public void setProvinciaId(String provinciaId) {
    this.provinciaId = provinciaId;
  }

  public String getProvincia() {
    return provincia;
  }

  public void setProvincia(String provincia) {
    this.provincia = provincia;
  }

  public String getDistritoId() {
    return distritoId;
  }

  public void setDistritoId(String distritoId) {
    this.distritoId = distritoId;
  }

  public String getDistrito() {
    return distrito;
  }

  public void setDistrito(String distrito) {
    this.distrito = distrito;
  }

  @Override
  public String toString() {
    return "Ubigeo{" + "ubigeoId=" + ubigeoId + ", departamentoId=" + departamentoId + ", departamento=" + departamento + ", provinciaId=" + provinciaId + ", provincia=" + provincia + ", distritoId=" + distritoId + ", distrito=" + distrito + '}';
  }

}
