package DTP.server;

import DTP.server.database.DataConnect;

import java.sql.ResultSet;
import java.sql.SQLException;

class TablePrinter {

    //prints the Account table from the database.
    static void PrintResultAccount(String query) throws SQLException {

        try {
            DataConnect.state = DataConnect.conn.createStatement();
            DataConnect.result = DataConnect.state.executeQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        ResultSet result = DataConnect.result;

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

    //prints the Games table from that database.
    static void PrintResultGames(String query) throws SQLException {

        try {
            DataConnect.state = DataConnect.conn.createStatement();
            DataConnect.result = DataConnect.state.executeQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        ResultSet result = DataConnect.result;

        while(DataConnect.result.next()) {
            String gameName = result.getString("game_name");
            String developer = result.getString("developer");
            String genre = result.getString("genre");
            String rating = result.getString("rating");
            System.out.format("%s, %s, %s, %s\n", gameName, developer,genre,rating);
        }
        System.out.println(" ");
    }

    //prints the HighScore table from the database.
    static void PrintResultScore(String query) throws SQLException {

        try {
            DataConnect.state = DataConnect.conn.createStatement();
            DataConnect.result = DataConnect.state.executeQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        ResultSet result = DataConnect.result;

        while(DataConnect.result.next()) {
            String gameName = result.getString("game_name");
            String gTag = result.getString("gamertag");
            String score = result.getString("score");
            System.out.format("%s, %s, %s\n", gameName, gTag,score);
        }
        System.out.println(" ");
    }
}
