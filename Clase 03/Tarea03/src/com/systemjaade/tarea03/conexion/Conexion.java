package com.systemjaade.tarea03.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

  private static Connection cn;

  public static Connection getConnection() throws Exception {
    String url = "";
    String driver = "";
    try {
      driver = "com.mysql.cj.jdbc.Driver";
      url = "jdbc:mysql://localhost:3306/tarea03?serverTimezone=America/Lima";
      Class.forName(driver).newInstance();
      cn = DriverManager.getConnection(url, "root", "root");
      System.out.println("llego a hacer la conexion");
    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
      System.err.println("No hay Conexion: " + e.getMessage());
    }
    return cn;
  }
}
