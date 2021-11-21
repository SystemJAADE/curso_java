package com.systemjaade.tarea03.service.impl;

import com.systemjaade.tarea03.conexion.Conexion;
import com.systemjaade.tarea03.model.Postulante;
import com.systemjaade.tarea03.service.IPostulanteService;
import com.systemjaade.tarea03.util.MetodoGenericos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Tarazona Marrujo Elí Gamaliel - "System JAADE S.A.C."
 * @version 30/12/2019 02:16 AM UTC -5
 */
public class PostulanteService implements IPostulanteService {

  @Override
  public void registrar(Postulante postulante) {
    Connection cn = null;
    try {
      cn = Conexion.getConnection();
      cn.setAutoCommit(true);
      String sql = "INSERT INTO tarea03.postulante"
        + "(nombres, apellido_paterno, apellido_materno, numero_dni, fecha_nacimiento, telefono_fijo, telefono_celular, correo_electronico, sexo, direccion, ubigeo_id)"
        + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, postulante.getNombres());
      pstm.setString(2, postulante.getApellidoPaterno());
      pstm.setString(3, postulante.getApellidoMaterno());
      pstm.setString(4, postulante.getNumeroDni());
      pstm.setDate(5, MetodoGenericos.dateJavaToDateSql(postulante.getFechaNacimiento()));
      pstm.setString(6, postulante.getTelefonoFijo());
      pstm.setString(7, postulante.getTelefonoCelular());
      pstm.setString(8, postulante.getCorreoElectronico());
      pstm.setBoolean(9, postulante.getSexo());
      pstm.setString(10, postulante.getDireccion());
      pstm.setString(11, postulante.getUbigeoId());
      pstm.executeUpdate();
      pstm.close();
    } catch (SQLException e) {
      throw new RuntimeException(e.getMessage());
    } catch (Exception e) {
      throw new RuntimeException("No se tiene acceso a la BD.");
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
  }

  @Override
  public void modificar(Postulante postulante) {
    Connection cn = null;
    System.out.println(postulante.toString());
    try {
      cn = Conexion.getConnection();
      cn.setAutoCommit(true);
      String sql = "UPDATE postulante "
        + "SET nombres = ?, "
        + "apellido_paterno = ?, "
        + "apellido_materno = ?, "
        + "numero_dni = ?, "
        + "fecha_nacimiento = ?, "
        + "telefono_fijo = ?, "
        + "telefono_celular = ?, "
        + "correo_electronico = ?, "
        + "sexo = ?, "
        + "direccion = ?, "
        + "ubigeo_id = ? "
        + "WHERE postulante_id = ?;";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, postulante.getNombres());
      pstm.setString(2, postulante.getApellidoPaterno());
      pstm.setString(3, postulante.getApellidoMaterno());
      pstm.setString(4, postulante.getNumeroDni());
      pstm.setDate(5, MetodoGenericos.dateJavaToDateSql(postulante.getFechaNacimiento()));
      pstm.setString(6, postulante.getTelefonoFijo());
      pstm.setString(7, postulante.getTelefonoCelular());
      pstm.setString(8, postulante.getCorreoElectronico());
      pstm.setBoolean(9, postulante.getSexo());
      pstm.setString(10, postulante.getDireccion());
      pstm.setString(11, postulante.getUbigeoId());
      pstm.setInt(12, postulante.getPostulanteId());
      pstm.executeUpdate();
      pstm.close();
    } catch (SQLException e) {
      throw new RuntimeException(e.getMessage());
    } catch (Exception e) {
      throw new RuntimeException("No se tiene acceso a la BD.");
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
  }

  @Override
  public void eliminar(Postulante postulante) {
    Connection cn = null;
    try {
      cn = Conexion.getConnection();
      cn.setAutoCommit(true);
      String sql = "DELETE FROM postulante WHERE postulante_id=? ;";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setInt(1, postulante.getPostulanteId());
      pstm.executeUpdate();
      pstm.close();
    } catch (SQLException e) {
      throw new RuntimeException(e.getMessage());
    } catch (Exception e) {
      throw new RuntimeException("No se tiene acceso a la BD.");
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
  }

  @Override
  public Postulante getPostulante(int postulanteId) {
    Postulante bean = new Postulante();
    Connection cn = null;
    try {
      cn = Conexion.getConnection();
      String sql = "SELECT "
        + "postulante_id, "
        + "nombres, "
        + "apellido_paterno, "
        + "apellido_materno, "
        + "numero_dni, "
        + "fecha_nacimiento, "
        + "telefono_fijo, "
        + "telefono_celular, "
        + "correo_electronico, "
        + "sexo, "
        + "direccion, "
        + "ubigeo_id "
        + "FROM postulante "
        + "WHERE postulante_id = ?";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setInt(1, postulanteId);
      ResultSet rs = pstm.executeQuery();
      if (rs.next()) {
        bean = mapRow(rs);
      }
      rs.close();
      pstm.close();
    } catch (SQLException e) {
      throw new RuntimeException(e.getMessage());
    } catch (Exception e) {
      throw new RuntimeException("No se tiene acceso a la BD.");
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return bean;
  }

  @Override
  public List<Postulante> getLista() {
    List<Postulante> lista = new ArrayList<>();
    Connection cn = null;
    try {
      cn = Conexion.getConnection();
      String sql = "SELECT "
        + "postulante_id, "
        + "nombres, "
        + "apellido_paterno, "
        + "apellido_materno, "
        + "numero_dni, "
        + "fecha_nacimiento, "
        + "telefono_fijo, "
        + "telefono_celular, "
        + "correo_electronico, "
        + "sexo, "
        + "direccion, "
        + "ubigeo_id "
        + "FROM postulante";
      PreparedStatement pstm = cn.prepareStatement(sql);
      ResultSet rs = pstm.executeQuery();
      while (rs.next()) {
        Postulante a = mapRow(rs);
        lista.add(a);
      }
      return lista;
    } catch (SQLException e) {
      throw new RuntimeException(e.getMessage());
    } catch (Exception e) {
      throw new RuntimeException("No se tiene acceso a la BD.");
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
  }

  @Override
  public Postulante getByNumeroDni(String numeroDni) {
    Postulante postulante = null;
    Connection cn = null;
    try {
      cn = Conexion.getConnection();
      String sql = "SELECT "
        + "postulante_id, "
        + "nombres, "
        + "apellido_paterno, "
        + "apellido_materno, "
        + "numero_dni, "
        + "fecha_nacimiento, "
        + "telefono_fijo, "
        + "telefono_celular, "
        + "correo_electronico, "
        + "sexo, "
        + "direccion, "
        + "ubigeo_id "
        + "FROM postulante "
        + "WHERE numero_dni = ? ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, numeroDni);
      ResultSet rs = pstm.executeQuery();
      if (rs.next()) {
        postulante = mapRow(rs);
      }
      return postulante;
    } catch (SQLException e) {
      throw new RuntimeException(e.getMessage());
    } catch (Exception e) {
      throw new RuntimeException("No se tiene acceso a la BD.");
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
  }

  public Postulante mapRow(ResultSet rs) throws SQLException {
    return Postulante.builder()
      .postulanteId(rs.getInt("postulante_id"))
      .nombres(rs.getString("nombres"))
      .apellidoPaterno(rs.getString("apellido_paterno"))
      .apellidoMaterno(rs.getString("apellido_materno"))
      .numeroDni(rs.getString("numero_dni"))
      .fechaNacimiento(rs.getDate("fecha_nacimiento"))
      .telefonoFijo(rs.getString("telefono_fijo"))
      .telefonoCelular(rs.getString("telefono_celular"))
      .correoElectronico(rs.getString("correo_electronico"))
      .sexo(rs.getBoolean("sexo"))
      .direccion(rs.getString("direccion"))
      .ubigeoId(rs.getString("ubigeo_id"))
      .build();
  }

}
