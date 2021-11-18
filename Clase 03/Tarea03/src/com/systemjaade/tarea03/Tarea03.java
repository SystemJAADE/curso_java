package com.systemjaade.tarea03;

import com.systemjaade.tarea03.conexion.Conexion;
import com.systemjaade.tarea03.view.Tarea03View;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elitg
 */
public class Tarea03 {

  public static void main(String[] args) {
    try {
      Tarea03View.main(args);
      Connection cn = null;
      
      System.out.println("Estado:  "+cn);
      cn = Conexion.getConnection();
    } catch (Exception ex) {
      Logger.getLogger(Tarea03.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
}
