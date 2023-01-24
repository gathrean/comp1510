package q2;

/**
 * Word class for the WordCounter class.
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class Word implements Comparable<Word> {

    /**
     * An instance variable that is a String for the word.
     */
    private final String word;
    
    /**
     * An instance variable that is an int representing the word's frequency.
     */
    private int frequency;
    
    /**
     * A constructor that accepts one parameter.
     * @param word String
     */
    public Word(String word) {
        this.word = word;
        this.frequency = 1;
    }
    
    /**
     * Gets the Word.
     * @return word
     */
    public String getWord() {
        return word;
    }
    
    /**
     * Gets the frequency.
     * @return frequency
     */
    public int getFrequency() {
        return frequency;
    }
    
    /**
     * Sets the frequency.
     * @param frequency int
     */
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
    
    
    /**
     * A method that increments the frequency by 1.
     */
    public void increment() {
        this.frequency++;
    }
    
    /**
     * A toString method.
     * @return word and frequency
     */
    @Override
    public String toString() {
        return word + "\t| " + frequency + " times";
    }

    @Override
    public int compareTo(Word o) {
        return Integer.compare(o.frequency, this.frequency);
    }
}
