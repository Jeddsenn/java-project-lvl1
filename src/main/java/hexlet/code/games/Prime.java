package hexlet.code.games;


import hexlet.code.Engine;

import static hexlet.code.Engine.getRandomNumber;

public class Prime {
    private static final int SCORE = 3;
    private static final int ANSWERSCORE = 2;

    private static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runGame() {

        String[][] questionAndAnswer = new String[SCORE][ANSWERSCORE];
        for (int i = 0; i < SCORE; i++) {
            int number = getRandomNumber();
            String question = String.valueOf(number);
            String answer = isPrime(number);
            questionAndAnswer[i][0] = question;
            questionAndAnswer[i][1] = answer;
        }
        Engine.runGame(QUESTION, questionAndAnswer);
    }

    public static String isPrime(int number) {
        int i = 2;
        boolean flag = false;
        while (i <= number / 2) {

            if (number % i == 0) {
                flag = true;
                break;
            }
            ++i;
        }
        if (!flag) {
            return "yes";
        } else {
            return "no";
        }
    }
}
