package hexlet.code.games;

import java.util.Arrays;

import static hexlet.code.Engine.getRandomNumber;
import static hexlet.code.Engine.getRandomNumberSeq;
import static hexlet.code.Engine.runGameEngine;

public class Progression {

    private static final int SCORE = 3;
    private static final String QUESTION = "What number is missing in the progression?\n";
    private static final int SEQUENCELENGTH = 10;
    private static final String REPLACEMENT = "??";


    public static void runProgressionGame() {

        String[][] questionAndAnswer = new String[SCORE][2];
        for (int i = 0; i < SCORE; i++) {
            int number = getRandomNumber();

            int sequenceRandomStep = getRandomNumberSeq();
            int[] originalSequence = generateArithmetcSequence(number, sequenceRandomStep);

            int answer = getRandomNumberSeq();
            String realAnswer = String.valueOf(originalSequence[answer]);

            String questionSequence = hideSequence(originalSequence, answer);
            questionAndAnswer[i][0] = questionSequence;
            questionAndAnswer[i][1] = realAnswer;

        }
        runGameEngine(QUESTION, questionAndAnswer);
    }


    public static int[] generateArithmetcSequence(int number, int number2) {
        int[] arithmeticSequence = new int[SEQUENCELENGTH];
        int currTerm = number;
        for (int i = 0; i < arithmeticSequence.length; i++) {
            arithmeticSequence[i] = currTerm;
            currTerm = currTerm + number2;
        }
        return arithmeticSequence;
    }

    public static String hideSequence(int[] originalSequence, int answer) {
        String sequence = Arrays.toString(originalSequence);
        String varibleToChange = String.valueOf(originalSequence[answer]);
        String replaceString = sequence.replace(varibleToChange, REPLACEMENT);
        return replaceString;
    }
}
