package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getTheName() {
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}

