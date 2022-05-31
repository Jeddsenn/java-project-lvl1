
package hexlet.code;


import java.util.Scanner;

public class Engine {

    public static final int ROUNDS_COUNT = 3;


    public static void runGame(String question, String[][] gameData) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(question);

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println("Question: " + gameData[i][0]);
            String playerAnswer = scanner.nextLine();
            System.out.println("Your answer: " + playerAnswer);

            if (playerAnswer.equals(gameData[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + playerAnswer + "'" + " is wrong answer. Correct answer was "
                    + "'" + gameData[i][1] + "'" + ". Let's try again, " + userName + "!");
                return;
            }
        }
        scanner.close();
        System.out.println("Congratulations, " + userName + "!");
    }
}
