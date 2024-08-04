package com.dominhdang.app.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

  private static Connection connection = null;
  private static final String URL = "jdbc:mysql://localhost:3306/sys";
  private static final String USERNAME = "root";
  private static final String PASSWORD = "dominhdang2002";

  public static Connection getConnection() {
    try {
      connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
      if (connection != null) {
        System.out.println("Connected successfully");
      } else {
        System.out.println("Connected failed");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return connection;
  }

  public static void closeConnection() {
    if (connection != null) {
      try {
        connection.close();
        System.out.println("Connection closed successfully!");
      } catch (SQLException e) {
        System.out.println("SQL Exception on closing connection: " + e.getMessage());
      }
    }
  }
}
