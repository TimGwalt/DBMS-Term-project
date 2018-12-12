/*
    DataConnect.java contains the methods fir connecting to the database.
 */

package DTP.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class DataConnect {

    // database vars
    static Connection conn;
    static Statement state = null;
    static ResultSet result = null;

    // create connection
    static Boolean connect(String username, String password) {
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
    static void disconnect() {
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
