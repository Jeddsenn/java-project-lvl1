package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.getTheName;
import static hexlet.code.games.Calc.runCalculateGame;
import static hexlet.code.games.EvenOdd.runEvenGame;
import static hexlet.code.games.GCD.runGCD;

public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter. \n 1 - Greet"
            + " \n 2 - Even \n 3 - Calc \n 4 - GCD  \n 0 - Exit \n ");
        Scanner scannerGameChoose = new Scanner(System.in);
        String userName = scannerGameChoose.nextLine();
        switch (userName) {
            case "1":
                getTheName();
            case "2":
                runEvenGame();
                break;
            case "3":
                runCalculateGame();
                break;
            case "4":
                runGCD();
                break;
            case "0":
                System.out.println("SEE YOU NEXT TIME");
                break;
            default:
                System.out.println("Goodbye!");
        }
    }
}





