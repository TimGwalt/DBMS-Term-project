package DTP.server.database;

import java.sql.*;

public class DataConnect {

    //Vars
    String url = "jdbc:postgresql://localhost:5432/DTP.server";
    String username = "postgres";
    String password = "postgres";

    // database vars
    public static Connection conn = null;
    public static Statement state = null;
    public static ResultSet result = null;

    // create connection
    public void connect() {
        try {

            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Disconnect from database
    public void disconnect() {
       try {

           if (conn != null) {
               conn.close();
           }

           if (state != null) {
               state.close();
           }

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
