package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final String QUESTION = "What is the result of the expression?";
    public static final char[] OPERATORS = {'+', '-', '*'};

    public static void runGame() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            gameData[i] = generateRoundData();
        }
        Engine.runGame(QUESTION, gameData);
    }

    public static String[] generateRoundData() {

            String[] gameData = new String[2];

            int number = Utils.getRandomNumber(MIN, MAX);
            int number2 = Utils.getRandomNumber(MIN, MAX);
            char operator = getRandomOperator();
            String question = Integer.toString(number) + " " + operator + " " + Integer.toString(number2);
            String answer = String.valueOf(calculate(operator, number, number2));

            gameData[0] = question;
            gameData[1] = answer;
            return gameData;
    }


    public static int calculate(char operator, int number, int number2) {
        switch (operator) {
            case '+':
                return number + number2;
            case '-':
                return number - number2;
            case '*':
                return number * number2;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static char getRandomOperator() {
        int i = Utils.getRandomNumber(0, OPERATORS.length);
        return OPERATORS[i];
    }
}
