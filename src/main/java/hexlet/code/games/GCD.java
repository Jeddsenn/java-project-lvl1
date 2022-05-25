package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.getRandomNumber;


public class GCD {
    private static final int SCORE = 3;
    private static final String QUESTION = "Find the greatest common divisor of given numbers.";
    private static final int ANSWERSCORE = 2;


    public static void runGame() {

        String[][] questionAndAnswer = new String[SCORE][ANSWERSCORE];
        for (int i = 0; i < SCORE; i++) {
            int number = getRandomNumber();
            int number2 = getRandomNumber();
            String gcdQuestion = number + " " + number2;
            questionAndAnswer[i][0] = gcdQuestion;
            questionAndAnswer[i][1] = String.valueOf(findGCD(number, number2));
        }
        Engine.runGame(QUESTION, questionAndAnswer);
    }

    static int findGCD(int number, int number1) {
        int r = 0;
        int a = 0;
        int b = 0;

        a = Math.max(number, number1);
        b = Math.min(number, number1);
        r = b;
        while (a % b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
}
