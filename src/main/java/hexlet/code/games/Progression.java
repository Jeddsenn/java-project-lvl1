package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

import static hexlet.code.Utils.getRandomNumber;
import static hexlet.code.Utils.getRandomNumberSeq;

public class Progression {

    private static final int SEQUENCELENGTH = 10;
    private static final int ANWSERSCORE = 2;

    private static final String QUESTION = "What number is missing in the progression?";

    private static final String REPLACEMENT = "..";


    public static void runGame() {

        String[][] roundsData = new String[Engine.ROUNDS_COUNT][ANWSERSCORE];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = getRandomNumber();
            int step = getRandomNumberSeq();
            int[] progression = generateProgression(firstNumber, step);
            int indexToHide = getRandomNumberSeq();
            String answer = String.valueOf(progression[indexToHide]);
            String question = hideSequence(progression, indexToHide);
            roundsData[i][0] = question;
            roundsData[i][1] = answer;

        }
        Engine.runGame(QUESTION, roundsData);
    }

    public static int[] generateProgression(int firstNumberInSequence, int sequenceRandomStep) {
        int[] arithmeticSequence = new int[SEQUENCELENGTH];
        int currentTerm = firstNumberInSequence;
        for (int i = 0; i < arithmeticSequence.length; i++) {
            arithmeticSequence[i] = currentTerm;
            currentTerm += sequenceRandomStep;
        }
        return arithmeticSequence;
    }

    public static String hideSequence(int[] arithmeticSequence, int answer) {
        String sequenceVar = Arrays.toString(arithmeticSequence);
        String variableInSequenceToHide = String.valueOf(arithmeticSequence[answer]);
        return sequenceVar.replace(variableInSequenceToHide, REPLACEMENT)
            .replaceAll(",", "")
            .replaceAll("]", "")
            .replaceAll("\\[", "")
            .trim();
    }
}
