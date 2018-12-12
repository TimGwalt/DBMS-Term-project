/*
    Menu.java contains the method for interacting with the menu.
 */


package DTP.server;

import java.sql.SQLException;
import java.util.Scanner;

class Menu {

    private static Scanner kbd = new Scanner(System.in);


    //The Menu
    static void ShowMenu() throws SQLException {
        int choice = 1;

        while(choice != 0) {
            System.out.println("(1) Print Account Table. \n(2) Print Games Table. \n(3) Print HighScore Table. ");
            System.out.println("(4) Print players playing a game. \n(5) Add New Account \n(6) Add New Game");
            System.out.println("(7) Add new High Score. \n(0) Exit.");


            choice = kbd.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Closing Connection.");
                    DataConnect.disconnect();
                    break;
                case 1:
                    TablePrinter.PrintResultAccount();
                    break;
                case 2:
                    TablePrinter.PrintResultGames();
                    break;
                case 3:
                    TablePrinter.PrintResultScore();
                    break;
                case 4:
                    TablePrinter.PlayersOfGames();
                    break;
                case 5:
                    InsertMenu.insertAccount();
                    break;
                case 6:
                    InsertMenu.insertGame();
                    break;
                case 7:
                    InsertMenu.insertScore();
                    break;
                default:
                    System.out.println("Invalid Option.");
                    break;
            }
        }
    }
}
