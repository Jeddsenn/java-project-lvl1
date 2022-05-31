package hexlet.code.games;


import hexlet.code.Engine;

import static hexlet.code.Utils.getRandomNumber;


public class Even {

    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runGame() {
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = getRandomNumber(MIN, MAX);
            questionAndAnswer[i][0] = String.valueOf(number);
            questionAndAnswer[i][1] = ((number % 2) == 0) ? "yes" : "no";
        }
        Engine.runGame(QUESTION, questionAndAnswer);
    }
}

