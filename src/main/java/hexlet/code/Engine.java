
package hexlet.code;


import java.util.Scanner;

public class Engine {
    private static final int MIN = 1;
    private static final int MAX = 100;

    private static final int MINPRGR = 2;
    private static final int MAXPRGR = 10;
    public static final int ROUNDS_COUNT = 3;
    private static final int COUNTOFRANDOMOPERATORS = 3;


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
        System.out.println("Congratulations, " + userName + "!");
    }

    public static int getRandomNumber() {
        return (int) ((Math.random() * (MAX - MIN)) + MIN);
    }

    public static int getRandomNumberSeq() {
        return (int) ((Math.random() * (MAXPRGR - MINPRGR)) + MINPRGR);
    }




    public static char getRandomOperator() {
        char[] operators = {'+', '-', '*'};
        int i = (int) (Math.random() * COUNTOFRANDOMOPERATORS);
        return operators[i];
    }
}
