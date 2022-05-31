package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class Progression {

    private static final int SEQUENCE_LENGTH = 10;
    private static final int ANWSERSCORE = 2;
    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final int MINPRGR = 2;
    private static final int MAXPRGR = 10;
    private static final String QUESTION = "What number is missing in the progression?";

    private static final String REPLACEMENT = "..";


    public static void runGame() {
        String[][] gameData = generateRoundData();
        Engine.runGame(QUESTION, gameData);
    }

    public static String[][] generateRoundData() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][ANWSERSCORE];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = Utils.getRandomNumber(MIN, MAX);
            int step = Utils.getRandomNumber(MINPRGR, MAXPRGR);
            int[] progression = generateProgression(firstNumber, step, SEQUENCE_LENGTH);
            int indexToHide = Utils.getRandomNumber(MINPRGR, MAXPRGR);
            String answer = String.valueOf(progression[indexToHide]);
            String question = hideSequence(progression, indexToHide);
            roundsData[i][0] = question;
            roundsData[i][1] = answer;
        }
        return roundsData;
    }

    public static int[] generateProgression(int firstNumberInSequence, int sequenceRandomStep, int sequencelength) {
        int[] arithmeticSequence = new int[sequencelength];
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
