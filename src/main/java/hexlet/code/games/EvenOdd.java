package hexlet.code.games;


import static hexlet.code.Engine.getRandomNumber;
import static hexlet.code.Engine.runGameEngine;


public class EvenOdd {

    private static final int SCORE = 3;
    private static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runEvenGame() {
        String[][] questionAndAnswer = new String[SCORE][2];
        for (int i = 0; i < SCORE; i++) {
            int number = getRandomNumber();
            questionAndAnswer[i][0] = String.valueOf(number);
            questionAndAnswer[i][1] = ((number % 2) == 0) ? "yes" : "no";
        }
        System.out.println(QUESTION);

        runGameEngine(QUESTION, questionAndAnswer);
    }
}

