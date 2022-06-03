package hexlet.code.games;


import hexlet.code.Engine;

import static hexlet.code.Utils.getRandomNumber;


public class Even {

    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runGame() {
        String[][] gameData = generateRoundData();
        Engine.runGame(QUESTION, gameData);
    }

    public static String[][] generateRoundData() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = getRandomNumber(MIN, MAX);
            gameData[i][0] = String.valueOf(number);
            gameData[i][1] = isEven(number);
        }
        return gameData;
    }

    public static String isEven(int number) {
        if ((number % 2) == 0) {
            return "yes";
        }
        return "no";
    }
}

