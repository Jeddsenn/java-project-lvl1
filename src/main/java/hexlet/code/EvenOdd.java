package hexlet.code;

import java.util.Scanner;


public class EvenOdd {

    private static final int SCORE = 3;
    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final String QUESTIONEVENGAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runEvenGame() {
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");


        String[][] questionAndAnswer = new String[SCORE][SCORE];
        for (int i = 0; i < SCORE; i++) {
            int number = (int) ((Math.random() * (MAX - MIN)) + MIN);
            questionAndAnswer[i][0] = String.valueOf(number);
            questionAndAnswer[i][1] = ((number % 2) == 0) ? "yes" : "no";
        }
        System.out.println(QUESTIONEVENGAME);
        for (int i = 0; i < SCORE; i++) {
            System.out.println("Question: " + questionAndAnswer[i][0]);
            String playerAnswer = scanner.nextLine();
            System.out.println("Your answer: " + playerAnswer);
            if (playerAnswer.equals(questionAndAnswer[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + playerAnswer + "'" + " is wrong answer. Correct answer was "
                    + "'" + questionAndAnswer[i][1] + "'" + ". Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congrtulations, " + userName + "!");
    }
}

