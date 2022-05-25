package hexlet.code.games;


import hexlet.code.Engine;

import static hexlet.code.Engine.getRandomNumber;
import static hexlet.code.Engine.getRandomOperator;

public class Calc {

    private static final int SCORE = 3;
    private static final int ANSWERSCORE = 2;
    private static final String QUESTION = "What is the result of the expression?";

    public static void runGame() {

        String[][] questionAndAnswer = new String[SCORE][ANSWERSCORE];
        for (int i = 0; i < SCORE; i++) {
            int number = getRandomNumber();
            int number2 = getRandomNumber();
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
                answer = number + number2;
                break;
            case '-':
                answer = number - number2;
                break;
            case '*':
                answer = number * number2;
                break;
            default:
                System.out.println("Something gone wrong while generating operator");
                break;
        }
        return answer;
    }
}
