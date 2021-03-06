package hexlet.code.games;


import hexlet.code.Engine;

import static hexlet.code.Utils.getRandomNumber;

public class Prime {
    private static final int MIN = 1;
    private static final int MAX = 100;

    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runGame() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            gameData[i] = generateRoundData();
        }
        Engine.runGame(DESCRIPTION, gameData);
    }

    public static String[] generateRoundData() {
        String[] gameData = new String[2];
        int number = getRandomNumber(MIN, MAX);

        String question = String.valueOf(number);
        String answer = isPrime(number) ? "yes" : "no";

        gameData[0] = question;
        gameData[1] = answer;
        return gameData;
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        int i = 2;
        boolean flag = false;
        while (i <= number / 2) {
            if (number % i == 0) {
                flag = true;
                break;
            }
            ++i;
        }
        return !flag;
    }
}
