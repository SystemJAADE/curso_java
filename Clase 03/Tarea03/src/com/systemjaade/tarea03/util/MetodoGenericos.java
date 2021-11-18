package com.systemjaade.tarea03.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MetodoGenericos {

  public static Date dateSqlToDateJava(java.sql.Date date) {
    Date dato = new Date(date.getTime());
    return dato;
  }

  public static java.sql.Date dateJavaToDateSql(Date date) {
    java.sql.Date dato = new java.sql.Date(date.getTime());
    return dato;
  }

  public static Date stringToDate(String fecha) throws ParseException {
    String pattern = "dd/MM/yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    Date date = simpleDateFormat.parse(fecha);
    return date;
  }
}
