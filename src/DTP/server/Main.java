package DTP.server;

import DTP.server.database.DataConnect;
import java.sql.SQLException;
import java.util.*;

public class Main {

    private static Scanner kbd = new Scanner(System.in);


    //Logs a user into the database
    private static void login() {
        String username, password;

        System.out.print("Please sign in. \nUsername: ");
        username  = kbd.nextLine();

        //System.out.print("Password: ");
        password = MaskPassword.getPassword("Password2: ");

        DataConnect.connect(username, password);
    }


    public static void main(String[] args) throws SQLException {

        login();
        Menu.ShowMenu();

        DataConnect.disconnect();

    }
}
