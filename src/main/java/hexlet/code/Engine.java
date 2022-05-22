
package hexlet.code;


import java.util.Scanner;

public class Engine {
    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final int SCORE = 3;
    private static final int COUNTOFRANDOMOPERATORS = 3;


    public static void runGameEngine(String question, String[][] questionAndAnswer) {
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");


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
            System.out.println("Congrtulations, " + userName + "!");
        }
    }

    public static int getRandomNumber() {
        int number = (int) ((Math.random() * (MAX - MIN)) + MIN);
        return number;
    }

    public static String getRandomOperator() {
        String[] operators = {"+", "-", "*"};
        int i = (int) (Math.random() * COUNTOFRANDOMOPERATORS);
        return operators[i];
    }
}
