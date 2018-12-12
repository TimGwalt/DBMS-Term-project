/*
    TablePrinter.java contains the methods for printing the tables of the database.
 */

package DTP.server;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class TablePrinter {

    private static Scanner kbd = new Scanner(System.in);

    //prints the Account table from the database.
    static void PrintResultAccount() throws SQLException {

        System.out.println("Printing Account Table:");
        String query = "SELECT * from account";
        try {
            DataConnect.state = DataConnect.conn.createStatement();
            DataConnect.result = DataConnect.state.executeQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        ResultSet result = DataConnect.result;

        //Printing each row.
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
    static void PrintResultGames() throws SQLException {

        System.out.println("Printing Games Table:");
        String query = "SELECT * from games";

        try {
            DataConnect.state = DataConnect.conn.createStatement();
            DataConnect.result = DataConnect.state.executeQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        ResultSet result = DataConnect.result;

        //Printing each row.
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
    static void PrintResultScore() throws SQLException {

        System.out.println("Printing HighScore Table:");
        String query = "SELECT * from highscore";

        try {
            DataConnect.state = DataConnect.conn.createStatement();
            DataConnect.result = DataConnect.state.executeQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        ResultSet result = DataConnect.result;

        //Printing each row.
        while(DataConnect.result.next()) {
            String gameName = result.getString("game_name");
            String gTag = result.getString("gamertag");
            String score = result.getString("score");
            System.out.format("%s, %s, %s\n", gameName, gTag,score);
        }
        System.out.println(" ");
    }

    //Prints the names of the players playing a specified game.
    static void PlayersOfGames() throws SQLException {
        System.out.println("What Game would you like to view the players for?");
        String game = kbd.nextLine();
        String query = "SELECT gamertag from Account where f_game = '" + game + "'";

        try {
            DataConnect.state = DataConnect.conn.createStatement();
            DataConnect.result = DataConnect.state.executeQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        ResultSet result = DataConnect.result;

        //Printing each row.
        while(DataConnect.result.next()) {
            String gamerTag = result.getString("gamertag");
            System.out.format("%s\n", gamerTag);
        }
        System.out.println(" ");

    }
}
