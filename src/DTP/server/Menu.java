package DTP.server;

import java.sql.SQLException;
import java.util.Scanner;


class Menu {

    private static Scanner kbd = new Scanner(System.in);


    //The Menu
    static void ShowMenu() throws SQLException {
        int choice = 1;
        String query, game;

        while(choice != 0) {
            System.out.println("(1) Print Account Table. \n(2) Print Games Table.");
            System.out.println("(3) Print HighScore Table. \n(4) Write a query. \n(0) Exit");
            choice = kbd.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Printing Account Table");
                    query = "SELECT * from account";
                    TablePrinter.PrintResultAccount(query);
                    break;
                case 2:
                    System.out.println("Printing Games Table");
                    query = "SELECT * from games";
                    TablePrinter.PrintResultGames(query);
                    break;
                case 3:
                    System.out.println("Printing HighScore Table");
                    query = "SELECT * from highscore";
                    TablePrinter.PrintResultScore(query);
                    break;
                case 4:
                    System.out.println("What Game would you like to view the players for?");
                    game = kbd.nextLine();
                    query = "SELECT gamertag from account where f_game = '" + game + "'";
                    TablePrinter.PlayersOfGames(query);
                    break;
                default:
                    System.out.println("Invalid Option.");
                    break;
            }
        }
    }
}
