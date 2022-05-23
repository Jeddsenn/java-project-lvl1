package hexlet.code.games;

import java.util.Arrays;

import static hexlet.code.Engine.getRandomNumber;
import static hexlet.code.Engine.getRandomNumberSeq;
import static hexlet.code.Engine.runGameEngine;

public class Progression {

    private static final int SCORE = 3;
    private static final int SEQUENCELENGTH = 10;
    private static final int ANWSERSCORE = 2;

    private static final String QUESTION = "What number is missing in the progression?";

    private static final String REPLACEMENT = "..";


    public static void runProgressionGame() {

        String[][] questionAndAnswer = new String[SCORE][ANWSERSCORE];
        for (int i = 0; i < SCORE; i++) {
            int firstNumberInSequence = getRandomNumber();
            int sequenceRandomStep = getRandomNumberSeq();
            int[] arithmeticSequence = generateArithmeticSequence(firstNumberInSequence, sequenceRandomStep);
            int answer = getRandomNumberSeq();
            String trueAnwser = String.valueOf(arithmeticSequence[answer]);
            String questionSequence = hideSequence(arithmeticSequence, answer);
            questionAndAnswer[i][0] = questionSequence;
            questionAndAnswer[i][1] = trueAnwser;

        }
        runGameEngine(QUESTION, questionAndAnswer);
    }

    public static int[] generateArithmeticSequence(int number, int number2) {
        int[] arithmeticSequence = new int[SEQUENCELENGTH];
        int currenTerm = number;
        for (int i = 0; i < arithmeticSequence.length; i++) {
            arithmeticSequence[i] = currenTerm;
            currenTerm = currenTerm + number2;
        }
        return arithmeticSequence;
    }

    public static String hideSequence(int[] arithmeticSequence, int answer) {
        String sequenceVar = Arrays.toString(arithmeticSequence);
        String variableInSequenceToHide = String.valueOf(arithmeticSequence[answer]);
        return sequenceVar.replace(variableInSequenceToHide, REPLACEMENT);
    }
}
