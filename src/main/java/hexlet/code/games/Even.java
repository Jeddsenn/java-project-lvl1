package hexlet.code.games;


import hexlet.code.Engine;

import static hexlet.code.Utils.getRandomNumber;


public class Even {

    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runGame() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            gameData[i] = generateRoundData();
        }
        Engine.runGame(DESCRIPTION, gameData);
    }

    public static String[] generateRoundData() {
        int number = getRandomNumber(MIN, MAX);
        String[] gameData = new String[2];

        String question = String.valueOf(number);
        String answer = isEven(number);

        gameData[0] = question;
        gameData[1] = answer;
        return gameData;
    }

    public static String isEven(int number) {
        if ((number % 2) == 0) {
            return "yes";
        }
        return "no";
    }
}

