package com.systemjaade.tarea03.util;

import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

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

  public static String aNormal(String fecha) {
    StringTokenizer st = new StringTokenizer(fecha, "-");
    String año = st.nextToken();
    String mes = st.nextToken();
    String dia = st.nextToken();
    String fecha2 = dia + "/" + mes + "/" + año;
    return fecha2;
  }

  public static void numerosInt(KeyEvent evt, JTextField t, int n) {
    if (t.getText().length() >= n) {
      evt.consume();
    }
    char car = evt.getKeyChar();
    if ((car < '0' || car > '9')) {
      evt.consume();
    }
  }

  public static Boolean validarEmail(String email) {
    // Patrón para validar el email
    Pattern pattern = Pattern
      .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    Matcher mather = pattern.matcher(email);
    return mather.find();
  }
  public static Boolean validarTelefono(String phone) {
    // Patrón para validar el email
    Pattern pattern = Pattern.compile("\\d{2}-\\d{7}");
    Matcher mather = pattern.matcher(phone);
    return mather.find();
  }
}
