package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final int ANSWERSCORE = 2;
    private static final String QUESTION = "What is the result of the expression?";

    public static void runGame() {

        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][ANSWERSCORE];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Utils.getRandomNumber();
            int number2 = Utils.getRandomNumber();
            char operator = getRandomOperator();
            String calcQuestion = Integer.toString(number) + " " + operator + " " + Integer.toString(number2);

            questionAndAnswer[i][0] = calcQuestion;
            questionAndAnswer[i][1] = String.valueOf(calculate(operator, number, number2));
        }
        Engine.runGame(QUESTION, questionAndAnswer);
    }

    public static int calculate(char operator, int number, int number2) {
        int answer = 0;
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
        char[] operators = {'+', '-', '*'};
        int i = (int) (Math.random() * operators.length);
        return operators[i];
    }
}
