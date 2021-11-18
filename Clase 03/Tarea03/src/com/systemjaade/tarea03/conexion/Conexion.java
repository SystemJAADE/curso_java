package com.systemjaade.tarea03.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

  private static Connection cn;

  public static Connection getConnection() throws Exception {
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/tarea03?serverTimezone=America/Lima";
    try {
      Class.forName(driver);
      cn = DriverManager.getConnection(url, "root", "root");
    } catch (ClassNotFoundException | SQLException e) {
      System.err.println("No hay Conexion: " + e.getMessage());
    }
    return cn;
  }
}
