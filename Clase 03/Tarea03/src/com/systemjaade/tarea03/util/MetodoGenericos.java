package com.systemjaade.tarea03.util;

import java.util.Date;

public class MetodoGenericos {

  public static Date DateSqlToDateJava(java.sql.Date date){
    Date dato = new Date(date.getTime());
    return dato;
  }

  public static java.sql.Date DateJavaToDateSql(Date date){
    java.sql.Date dato = new java.sql.Date(date.getTime());
    return dato;
  }
}
