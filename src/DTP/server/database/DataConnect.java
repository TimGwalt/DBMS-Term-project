package DTP.server.database;

import java.sql.*;
import java.util.*;


public class DataConnect {

    //Vars
    static Scanner kbd = new Scanner(System.in);
    static String url = "jdbc:postgresql://localhost:5432/DTP.server";

    // database vars
    public static Connection conn = null;
    public static Statement state = null;
    public static ResultSet result = null;

    // create connection
    public static int connect(String username, String password) {
        try {

            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database");
            return 1;

        } catch (SQLException e) {
            System.out.println("Connection failed.");
            return 0;
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
