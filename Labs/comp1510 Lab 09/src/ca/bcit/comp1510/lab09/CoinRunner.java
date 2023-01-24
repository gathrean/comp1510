package ca.bcit.comp1510.lab09;

/**
 * Java programs for running the Coin class.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class CoinRunner {

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {

        Coin coin = new Coin();

        int run = 0;
        int longestRun = 0;

        final int repeat = 100;

        for (int i = 0; i < repeat; i++) {
            coin.flip();
            System.out.println(coin.toString());

            if (coin.isHeads()) {
                run++;
            }
            if (!coin.isHeads() || i == repeat) {
                if (run > longestRun) {
                    longestRun = run;
                }
                
                run = 0;
            }

        }
        System.out.println("The longest run of heads is " + longestRun);
    }
}
