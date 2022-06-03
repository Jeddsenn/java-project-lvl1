
package hexlet.code;


import java.util.Scanner;

public class Engine {

    public static final int ROUNDS_COUNT = 3;


    public static void runGame(String description, String[][] roundsData) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);


        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String question = roundsData[i][0];
            String answer = roundsData[i][1];

            System.out.println("Question: " + question);
            String playerAnswer = scanner.nextLine();
            System.out.println("Your answer: " + playerAnswer);

            if (!playerAnswer.equals(answer)) {
                System.out.println("'" + playerAnswer + "'" + " is wrong answer. Correct answer was "
                    + "'" + answer + "'" + ". Let's try again, " + userName + "!");
                scanner.close();
                return;
            }
            System.out.println("Correct!");
        }
        scanner.close();
        System.out.println("Congratulations, " + userName + "!");
    }
}
