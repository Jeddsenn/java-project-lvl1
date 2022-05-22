package hexlet.code.games;


import static hexlet.code.Engine.getRandomNumber;
import static hexlet.code.Engine.getRandomOperator;
import static hexlet.code.Engine.runGameEngine;

public class Calc {

    private static final int SCORE = 3;
    private static final String QUESTION = "What is the result of the expression?";

    public static void runCalculateGame() {

        String[][] questionAndAnswer = new String[SCORE][2];
        for (int i = 0; i < SCORE; i++) {
            int number = getRandomNumber();
            int number2 = getRandomNumber();
            String opetaror = getRandomOperator();
            String calcQuestion = number + "" + opetaror + "" + number2;

            questionAndAnswer[i][0] = calcQuestion;
            questionAndAnswer[i][1] = String.valueOf(calculateTwoRandomNumbers(opetaror, number, number2));
        }
        System.out.println(QUESTION);
        runGameEngine(QUESTION, questionAndAnswer);
    }

    public static int calculateTwoRandomNumbers(String opetaror, int number, int number2) {
        var answer = 0;
        switch (opetaror) {
            case "+":
                answer = number + number2;
            case "-":
                answer = number - number2;
            case "*":
                answer = number * number2;
            default:
                System.out.println("Something gone wrong while generating operator");
        }
        return answer;
    }
}
