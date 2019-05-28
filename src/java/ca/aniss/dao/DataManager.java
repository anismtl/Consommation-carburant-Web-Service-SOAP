package ca.aniss.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Anis
 */
public class DataManager {
   
    private static DataManager instance;
    private Connection connection;
    private String dbURL = "jdbc:oracle:thin:@aniss.ca:1521:xe";
    private String dbUserName = "auto";
    private String dbPassword = "auto2019";

    private DataManager() throws SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            this.connection = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
           
        } catch (ClassNotFoundException ex) {
         
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
      
            }
        }
    }

    public static DataManager getInstance() {
        try {
            if (instance == null) {
                instance = new DataManager();
            } else if (instance.getConnection().isClosed()) {
                instance = new DataManager();
            }
            System.out.println("\n=*=*=*=*=*=*=Database a ete bien instansier=*=*=*=*=*=*=");
            return instance;
        } catch (SQLException ex) {
            System.out.println("\n=*=*=*=*=*=*=Database Connection close Failed : " + ex.getMessage() + "=*=*=*=*=*=*=");
        }
        return instance;
    }
}
