package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.getRandomNumber;


public class GCD {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MIN = 1;
    private static final int MAX = 100;


    public static void runGame() {
        String[][] gameData = generateRoundData();
        Engine.runGame(DESCRIPTION, gameData);
    }

    public static String[][] generateRoundData() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = getRandomNumber(MIN, MAX);
            int number2 = getRandomNumber(MIN, MAX);
            String gcdQuestion = number + " " + number2;
            gameData[i][0] = gcdQuestion;
            gameData[i][1] = String.valueOf(findGCD(number, number2));
        }
        return gameData;
    }

    static int findGCD(int number, int number1) {

        int a = Math.max(number, number1);
        int b = Math.min(number, number1);
        int r = b;
        while (a % b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
}
