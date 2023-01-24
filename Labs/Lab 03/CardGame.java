package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * This program works with enumerations.
 *
 * @author Ean Dela Cruz
 * @version 2022
 *
 */
public class CardGame {

  // Standard card values in a deck.
  enum Rank {
    ace, 
    two, three, four, 
    five, six, seven, 
    eight, nine, ten, 
    jack, queen, king
  }

  // Standard card suites in a deck.
  enum Suit {
    hearts, 
    diamonds, 
    clubs, 
    spades
  }

  /**
   * Drive the program.
   *
   * @param args unused
   */
  
  public static void main(String[] args) {
    

    Random random = new Random();
    int randomRankChoice = random.nextInt(Rank.values().length);
    Rank randomRank = Rank.values()[randomRankChoice];
    
    int randomSuitChoice = random.nextInt(Suit.values().length);
    Suit randomSuit = Suit.values()[randomSuitChoice];
    
    System.out.println("Your card is a " + randomRank + " of " + randomSuit);

  }

}
