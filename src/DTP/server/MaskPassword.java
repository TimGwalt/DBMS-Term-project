package DTP.server;

import java.io.Console;

public final class MaskPassword {

    private MaskPassword() {
    }

        public static String getPassword(String prompt) {
            Console console = System.console();

            if (console == null) {
                System.out.println("Couldn't get Console instance");
                System.exit(1);
            }

            char password[] = console.readPassword(prompt);

            return new String(password);
        }
}
