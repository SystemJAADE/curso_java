package com.systemjaade.tarea03.service;

import com.systemjaade.tarea03.conexion.Conexion;
import com.systemjaade.tarea03.model.Ubigeo;
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
public class UbigeoService {

  public List<Ubigeo> getDepartamento() {
    List<Ubigeo> lista = new ArrayList<>();
    Connection cn = null;
    try {
      cn = Conexion.getConnection();
      String sql = "SELECT * FROM ubigeo "
        + "GROUP BY departamento_id ;";
      PreparedStatement pstm = cn.prepareStatement(sql);
      ResultSet rs = pstm.executeQuery();
      while (rs.next()) {
        lista.add(mapRow(rs));
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
    return lista;
  }

  public List<Ubigeo> getProvincia(String departamentoId) {
    List<Ubigeo> lista = new ArrayList<>();
    Connection cn = null;
    try {
      cn = Conexion.getConnection();
      String sql = "SELECT * FROM ubigeo "
        + "WHERE provincia_id != '' "
        + "AND departamento_id = ? "
        + "GROUP BY departamento_id, provincia_id;";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, departamentoId);
      ResultSet rs = pstm.executeQuery();
      while (rs.next()) {
        lista.add(mapRow(rs));
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
    return lista;
  }

  public List<Ubigeo> getDistrito(String departamentoId, String provinciaId) {
    List<Ubigeo> lista = new ArrayList<>();
    Connection cn = null;
    try {
      cn = Conexion.getConnection();
      String sql = "SELECT * FROM ubigeo "
        + "WHERE departamento_id = ? "
        + "AND provincia_id = ? "
        + "AND distrito_id != '';";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, departamentoId);
      pstm.setString(2, provinciaId);
      ResultSet rs = pstm.executeQuery();
      while (rs.next()) {
        lista.add(mapRow(rs));
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
    return lista;
  }

  public Ubigeo mapRow(ResultSet rs) throws SQLException {
    Ubigeo bean = new Ubigeo();
    bean.setUbigeoId(rs.getString("ubigeo_id"));
    bean.setDepartamentoId(rs.getString("departamento_id"));
    bean.setDepartamento(rs.getString("departamento"));
    bean.setProvinciaId(rs.getString("provincia_id"));
    bean.setProvincia(rs.getString("provincia"));
    bean.setDistritoId(rs.getString("distrito_id"));
    bean.setDistrito(rs.getString("distrito"));
    return bean;
  }
}
