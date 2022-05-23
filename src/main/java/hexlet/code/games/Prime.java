package hexlet.code.games;


import static hexlet.code.Engine.getRandomNumber;
import static hexlet.code.Engine.runGameEngine;

public class Prime {
    private static final int SCORE = 3;
    private static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runPrimeGame() {

        String[][] questionAndAnswer = new String[SCORE][2];
        for (int i = 0; i < SCORE; i++) {
            int number = getRandomNumber();
            String question = String.valueOf(number);

            String anwser = checkIfPrime(number);



            questionAndAnswer[i][0] = question;
            questionAndAnswer[i][1] = anwser;

        }
        runGameEngine(QUESTION, questionAndAnswer);
    }

    public static String checkIfPrime(int number) {
        int i = 2;
        boolean flag = false;
        while (i <= number / 2) {

            if (number % i == 0) {
                flag = true;
                break;
            }
            ++i;
        }
        if (!flag) {
            return "yes";
        } else {
            return "no";
        }
    }
}
