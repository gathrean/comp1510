package ca.bcit.comp1510.lab06;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Reads baseball data in from a comma delimited file. Each line of the file
 * contains a name followed by a list of symbols indicating the result of each
 * at bat: h for hit, o for out, w for walk, s for sacrifice. Statistics are
 * computed and printed for each player.
 * 
 * @author blink
 *
 */
public class BaseballStats {
    /*
     * Reads baseball stats from a file and counts total hits, outs, walks, and
     * sacrifice flies for each player.
     */

    public static void main(String[] args) throws FileNotFoundException {

        // Formatting the average results
        DecimalFormat formatter = new DecimalFormat("#0.#%");

        // "One scanner is used to read in a file name from standard input"
        Scanner scan;

        // "The file name is then used to create a scanner to operate on that file."
        Scanner fileScan;
        String fileName;

        // "A third scanner will be used to parse each line the file."
        Scanner lineScan = null;

        scan = new Scanner(System.in);

        // Prompts user what .dat file they want the program to read.
        System.out.println("Which file do you want to read?");
        System.out.println("stats.dat or stats2.dat ?");
        String file = scan.nextLine();

        System.out.println();
        fileScan = new Scanner(new File(file));

        // Read and process each line of the file
        while (fileScan.hasNext()) {

            fileName = fileScan.nextLine();
            String player = fileName.strip();

            lineScan = new Scanner(player);
            lineScan.useDelimiter("[,]");

            int hits = 0;
            int outs = 0;
            int walks = 0;
            int sacrifices = 0;

            lineScan = new Scanner(fileName);
            lineScan.useDelimiter(",");

            String playerName = lineScan.next();
            System.out.println("Player:     " + playerName);

            while (lineScan.hasNext()) {

                // Splits the h, w, o, and s letters into tokens
                String token = lineScan.next();

                if (token.equals("h")) {
                    hits++;
                } else if (token.equals("o")) {
                    outs++;
                } else if (token.equals("w")) {
                    walks++;
                } else if (token.equals("s")) {
                    sacrifices++;
                }
            }

            double total = hits + outs;
            double average = hits / total;
            
            System.out.println("Hits:       " + hits);
            System.out.println("Outs:       " + outs);
            System.out.println("Walks:      " + walks);
            System.out.println("Sac Flies:  " + sacrifices);
            System.out.println("Average:    " + formatter.format(average));
            System.out.println();
        }
        scan.close();
    }
}