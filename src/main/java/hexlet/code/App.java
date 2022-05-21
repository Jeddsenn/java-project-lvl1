package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.getTheName;
import static hexlet.code.EvenOdd.runEvenGame;

public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter. \n 1 - Greet \n 2 - Even  \n 0 - Exit \n ");
        Scanner scannerGameChoose = new Scanner(System.in);
        String userName = scannerGameChoose.nextLine();
        switch (userName) {
            case "1":
                getTheName();
            case "2":
                runEvenGame();
                break;
            case "0":
                System.out.println("SEE YOU NEXT TIME");
                break;
            default:
                System.out.println("Goodbye!");
        }
    }
}





