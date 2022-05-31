package hexlet.code;



public class Utils {

    private static final int MIN = 1;
    private static final int MAX = 100;

    private static final int MINPRGR = 2;
    private static final int MAXPRGR = 10;


    public static int getRandomNumber() {
        return (int) ((Math.random() * (Utils.MAX - Utils.MIN)) + Utils.MIN);
    }
    public static int getRandomNumberSeq() {
        return (int) ((Math.random() * (Utils.MAXPRGR - Utils.MINPRGR)) + Utils.MINPRGR);
    }
}
