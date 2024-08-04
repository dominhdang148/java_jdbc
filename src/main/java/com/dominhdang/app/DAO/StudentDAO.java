package com.dominhdang.app.DAO;

import java.sql.Connection;

import com.dominhdang.app.Utils.DatabaseConnection;

public class StudentDAO {
  private Connection connection;

  public StudentDAO() {
    connection = DatabaseConnection.getConnection();
  }
}
