package DTP.server;

import DTP.server.database.DataConnect;
import java.sql.SQLException;
import java.util.*;

public class Main {

    private static Scanner kbd = new Scanner(System.in);


    //Logs a user into the database
    private static boolean login() {
        String username, password;

        System.out.print("Please sign in. \nUsername: ");
        username  = kbd.nextLine();

        System.out.print("Password: ");
        password = kbd.nextLine();

        return DataConnect.connect(username, password);
    }


    public static void main(String[] args) throws SQLException {

        if (login() == true) {
            Menu.ShowMenu();
        }


        DataConnect.disconnect();

    }
}
