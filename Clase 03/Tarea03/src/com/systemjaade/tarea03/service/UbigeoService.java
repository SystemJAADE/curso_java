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

  public Ubigeo getUbigeo(int ubigeoId) {
    Ubigeo bean = new Ubigeo();
    Connection cn = null;
    try {
      cn = Conexion.getConnection();
      String sql = "SELECT "
        + "ubigeo_id, "
        + "departamento_id, "
        + "departamento, "
        + "provincia_id, "
        + "provincia, "
        + "distrito_id, "
        + "distrito, "
        + "FROM ubigeo "
        + "WHERE ubigeo_id = ?";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setInt(1, ubigeoId);
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

  public List<Ubigeo> getLista() {
    List<Ubigeo> lista = new ArrayList<>();
    Connection cn = null;
    try {
      cn = Conexion.getConnection();
      String sql = "SELECT "
        + "ubigeo_id, "
        + "departamento_id, "
        + "departamento, "
        + "provincia_id, "
        + "provincia, "
        + "distrito_id, "
        + "distrito, "
        + "FROM ubigeo ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      ResultSet rs = pstm.executeQuery();
      while (rs.next()) {
        Ubigeo a = mapRow(rs);
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

  public Ubigeo mapRow(ResultSet rs) throws SQLException {
    Ubigeo bean = new Ubigeo();
    bean.setUbigeoId(rs.getString("ubigeo_id"));
    bean.setDepartamentoId(rs.getString("departamento"));
    bean.setDepartamento(rs.getString("departamento"));
    bean.setProvincia(rs.getString("provincia"));
    bean.setProvincia(rs.getString("provincia"));
    bean.setDistrito(rs.getString("distrito"));
    bean.setDistrito(rs.getString("distrito"));
    return bean;
  }
}
