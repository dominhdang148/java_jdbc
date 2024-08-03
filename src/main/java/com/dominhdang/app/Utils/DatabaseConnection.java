package com.dominhdang.app.Utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

  public static final String URL = "jdbc:mysql://localhost:3306/sys";
  public static final String USERNAME = "root";
  public static final String PASSWORD = "dominhdang2002";

  public static Connection getConnection() {
    Connection connection = null;

    try {
      connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

    } catch (Exception e) {
      e.printStackTrace();
    }

    return connection;
  }
}
