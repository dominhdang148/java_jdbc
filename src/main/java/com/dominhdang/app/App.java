package com.dominhdang.app;

import com.dominhdang.app.DAO.StudentDAO;
import com.dominhdang.app.Utils.DatabaseConnection;

public class App {
  public static void main(String[] args) {
    try {
      StudentDAO studentDAO = new StudentDAO();
    } finally {
      DatabaseConnection.closeConnection();
    }
  }
}
