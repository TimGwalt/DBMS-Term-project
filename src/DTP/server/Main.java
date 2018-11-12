package DTP.server;

import DTP.server.database.DataConnect;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.*;



public class Main {

    public static Scanner kbd = new Scanner(System.in);



    //prints the Account table.
    public static void PrintResultAccount(String query) throws SQLException {

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

    //prints the Games table.
    public static void PrintResultGames(String query) throws SQLException {

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

    //prints the HighScore table.
    public static void PrintResultScore(String query) throws SQLException {

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

    //The Menu
    public static void Menu() throws SQLException {
        int choice = 1;
        String query;

        while(choice != 0) {
            System.out.println("(1) Print Account Table. \n(2) Print Games Table.");
            System.out.println("(3) Print HighScore Table. \n(4) Write a query. \n(0) Exit");
            choice = kbd.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Printing Account Table");
                    query = "SELECT * from account";
                    PrintResultAccount(query);
                    break;
                case 2:
                    System.out.println("Printing Games Table");
                    query = "SELECT * from games";
                    PrintResultGames(query);
                    break;
                case 3:
                    System.out.println("Printing HighScore Table");
                    query = "SELECT * from highscore";
                    PrintResultScore(query);
                    break;
                case 4:
                    System.out.println("Write your query below.");
                    query = kbd.nextLine();
                    break;
                default:
                    break;
            }
        }
    }


    public static void main(String[] args) throws SQLException {

        DataConnect connection = new DataConnect();
        connection.connect();

        Menu();

        connection.disconnect();

    }
}
