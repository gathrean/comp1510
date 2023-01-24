package q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A Java program that will count how many distinct words there in an enclosed
 * text file, which is a plain text copy of the King James Bible.
 *
 * @author Gathrean Dela Cruz
 * @version 1.0
 */
public class WordCounter {

    /** Ten. */
    private static final int TEN = 10;

    /** An ArrayList of my List of Words. */
    private static final ArrayList<Word> WORDSLIST = new ArrayList<>();

    private static void sorter(String inputWord) {
        Boolean repeat = false;

        for (Word word : WORDSLIST) {

            if (inputWord.equals(word.getWord())) {
                
                word.increment();
                repeat = true;
                break;
            }
        }
        
        if (!repeat && !inputWord.equals("")) {
            WORDSLIST.add(new Word(inputWord));
        }
        

    }

    /**
     * A method that accepts a String as a parameter. This parameter will be the
     * name of the file to open.
     * 
     * @param fileName String
     */
    public static void parseBook(String fileName) {
        try {
            Scanner fileScan = new Scanner(new File(fileName));
            fileName.toLowerCase();

            while (fileScan.hasNext()) {

                String inputWord = fileScan.next().toLowerCase();
                inputWord = inputWord.replaceAll("[^a-zA-Z]", "");
                sorter(inputWord);

            }

            fileScan.close();

            WORDSLIST.sort(null);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * A method that prints the top words.
     * 
     * @param n int
     * @return n
     */
    public static int printTopWords(int n) {
        System.out.println("");
        System.out.println("Top " + n + " Frequent Words");
        System.out.println("---------------------");

        for (int i = 0; i < n; i++) {
            System.out.println(WORDSLIST.get(i));
        }

        return n;
    }

    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        String fileName = "src/bible.txt";
        WordCounter.parseBook(fileName);

        int numUnique = WORDSLIST.size();

        System.out.println("Unique words: " + numUnique);
        printTopWords(TEN);

    }

}
