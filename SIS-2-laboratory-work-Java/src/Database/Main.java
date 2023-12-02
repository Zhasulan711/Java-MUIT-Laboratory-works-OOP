package Database;

import java.sql.*;

public class Main {

  static final String JDBC_DRIVER = "org.postgresql.Driver";
  static final String DB_URL = "jdbc:postgresql://localhost:5432/employees";
  static final String USER = "postgres";
  static final String PASS = "kot12345";

  public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;

    try {
      Class.forName(JDBC_DRIVER);
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);

      System.out.println("Creating statement...");
      stmt = conn.createStatement();

      String createTableSQL =
        "CREATE TABLE IF NOT EXISTS Employees " +
        "(id SERIAL PRIMARY KEY, " +
        " first VARCHAR(255), " +
        " last VARCHAR(255), " +
        " age INT)";
      stmt.executeUpdate(createTableSQL);
      System.out.println("Table created successfully");

      String insertSQL =
        "INSERT INTO Employees (first, last, age) VALUES ('kot', 'lol', 26)";
      stmt.executeUpdate(insertSQL);

      String selectSQL = "SELECT id, first, last, age FROM Employees";
      ResultSet rs = stmt.executeQuery(selectSQL);

      while (rs.next()) {
        System.out.print("ID: " + rs.getInt("id"));
        System.out.print(", Age: " + rs.getInt("age"));
        System.out.print(", First: " + rs.getString("first"));
        System.out.println(", Last: " + rs.getString("last"));
      }

      String updateSQL = "UPDATE Employees SET age = 31 WHERE first = 'kot'";
      stmt.executeUpdate(updateSQL);

      rs = stmt.executeQuery(selectSQL);
      System.out.println("\nAfter Update:");
      while (rs.next()) {
        System.out.print("ID: " + rs.getInt("id"));
        System.out.print(", Age: " + rs.getInt("age"));
        System.out.print(", First: " + rs.getString("first"));
        System.out.println(", Last: " + rs.getString("last"));
      }

      String deleteSQL = "DELETE FROM Employees WHERE first = 'kot'";
      stmt.executeUpdate(deleteSQL);

      rs = stmt.executeQuery(selectSQL);
      System.out.println("\nAfter Delete:");
      while (rs.next()) {
        System.out.print("ID: " + rs.getInt("id"));
        System.out.print(", Age: " + rs.getInt("age"));
        System.out.print(", First: " + rs.getString("first"));
        System.out.println(", Last: " + rs.getString("last"));
      }

      rs.close();
      stmt.close();
      conn.close();
    } catch (SQLException se) {
      se.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if (stmt != null) stmt.close();
      } catch (SQLException se) {
        se.printStackTrace();
      }
      try {
        if (conn != null) conn.close();
      } catch (SQLException se) {
        se.printStackTrace();
      }
    }
  }
}
