package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print(
            """
                Please enter the game number and press Enter.\s
                 1 - Greet\s
                 2 - Even\s
                 3 - Calc\s
                 4 - GCD\s
                 5 - Progression\s
                 6 - Prime \s
                 0 - Exit\s
                \s""");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input) {
            case "1":
                Cli.greetUser();
                break;
            case "2":
                Even.runGame();
                break;
            case "3":
                Calc.runGame();
                break;
            case "4":
                GCD.runGame();
                break;
            case "5":
                Progression.runGame();
                break;
            case "6":
                Prime.runGame();
                break;
            case "0":
                System.out.println("SEE YOU NEXT TIME");
                break;
            default:
                System.out.println("Goodbye!");
        }
    }
}





