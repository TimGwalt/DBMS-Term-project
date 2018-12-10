package DTP.server.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataConnect {

    // database vars
    public static Connection conn;
    public static Statement state = null;
    public static ResultSet result = null;

    // create connection
    public static Boolean connect(String username, String password) {
        try {
            String url = "jdbc:postgresql://localhost:5432/DTP.server";
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database");
            return true;

        } catch (SQLException e) {
            System.out.println("Connection failed.");
            return false;
        }
    }

    // Disconnect from database
    public static void disconnect() {
       try {
            //Closes the connection
           if (conn != null) {
               conn.close();
           }
            //closes the statement
           if (state != null) {
               state.close();
           }
            //closes the result set
           if (result != null) {
               result.close();
           }

           System.out.println("Server disconnected");
       }
       catch (Exception e) {
           e.printStackTrace();
       }
    }
}
