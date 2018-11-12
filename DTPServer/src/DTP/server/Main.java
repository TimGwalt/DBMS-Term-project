package DTP.server;

import DTP.server.database.DataConnect;
import java.sql.SQLException;
import java.sql.ResultSet;


public class Main {

    //prints the result set
    public static void PrintResult(ResultSet result) throws SQLException {
        while(DataConnect.result.next()) {
            String fName = result.getString("fname");
            String lName = result.getString("lname");
            String gTag = result.getString("gamertag");
            String email = result.getString("email");
            String fav = result.getString("f_game");
            System.out.format("%s, %s, %s, %s, %s \n", fName, lName, gTag, email, fav);
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        DataConnect connection = new DataConnect();
        connection.connect();

        String query = "SELECT * from account";

        try {
            DataConnect.state = DataConnect.conn.createStatement();
            DataConnect.result = DataConnect.state.executeQuery(query);
            PrintResult(DataConnect.result);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        connection.disconnect();

    }
}
