/*
    InsertMenu.java contains the methods for inserting information into the database.
 */

package DTP.server;

import java.util.Scanner;
import java.sql.SQLException;


class InsertMenu {

    private static Scanner kbd = new Scanner(System.in);

    //Allows a user to insert a new account into the database.
    static void insertAccount() throws SQLException {
        String fName, lName, gamertag, email, fGame, query;

        System.out.println("Enter the account information: ");

        System.out.print("First Name: ");
        fName = kbd.nextLine();
        System.out.print("Last Name: ");
        lName = kbd.nextLine();
        System.out.print("Gamertag: ");
        gamertag = kbd.nextLine();
        System.out.print("Email: ");
        email = kbd.nextLine();
        System.out.print("Favorite Game: ");
        fGame = kbd.nextLine();

        query = "INSERT INTO Account VALUES ('" + fName + "','" + lName + "','" +
                gamertag + "','" + email + "','"+ fGame + "');";

        System.out.println("Adding '" + fName + "','" + lName + "','" + gamertag + "','" + email + "','"+ fGame + "'");
        try {
            DataConnect.conn.prepareStatement(query).executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //Allows a user to insert a new game into the database.
    static void insertGame() {
        String name, developer, genre, rating, query;

        System.out.println("Enter the game information: ");

        System.out.print("Game Name: ");
        name = kbd.nextLine();
        System.out.print("Developer: ");
        developer = kbd.nextLine();
        System.out.print("Genre: ");
        genre = kbd.nextLine();
        System.out.print("ESRB Rating: ");
        rating = kbd.nextLine();

        query = "INSERT INTO Games VALUES ('" + name + "','" + developer + "','" + genre + "','" + rating + "');";

        System.out.println("Adding '" + name + "','" + developer + "','" +
                genre + "','" + rating + "'");
        try {
            DataConnect.conn.prepareStatement(query).executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Allows a user to insert a new high score into the database.
    static void insertScore() {
        String gamertag, game, score, query;

        System.out.println("Enter the high score information: ");

        System.out.print("gamertag: ");
        gamertag = kbd.nextLine();
        System.out.print("game: ");
        game = kbd.nextLine();
        System.out.print("score: ");
        score = kbd.nextLine();

        query = "INSERT INTO Highscore VALUES ('" + gamertag + "','" + game + "','" + score + "');";

        System.out.println("Adding '" + gamertag + "','" + game + "','" +
                score + "'");
        try {
            DataConnect.conn.prepareStatement(query).executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
