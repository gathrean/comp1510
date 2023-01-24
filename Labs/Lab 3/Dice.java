package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * A Java program that simulates the rolling of a collection of D&D dice.
 *
 * @author Ean Dela Cruz
 * @version 2022
 */

public class Dice {

  /**
   * Drives the program.
   *
   * @param args unused
   * 
   */

  public static void main(String[] args) {

    Random generator = new Random();
    final int four = 3;
    final int six = 5;
    final int eight = 7;
    final int ten = 9;
    final int twelve = 11;
    final int twenty = 19;

    // To avoid the dice from rolling a 0,
    // I chose values one less than the integer

    int num4;
    int num6;
    final int num8;
    final int num10;
    final int num12;
    final int num20;

    num4 = generator.nextInt(four) + 1;
    System.out.println("You roll a 4-sided die, your number is " + num4);

    num6 = generator.nextInt(six) + 1;
    System.out.println("You roll a 6-sided die, your number is " + num6);

    num8 = generator.nextInt(eight) + 1;
    System.out.println("You roll an 8-sided die, your number is " + num8);

    num10 = generator.nextInt(ten) + 1;
    System.out.println("You roll a 10-sided die, your number is " + num10);

    num12 = generator.nextInt(twelve) + 1;
    System.out.println("You roll a 12-sided die, your number is " + num12);

    num20 = generator.nextInt(twenty) + 1;
    System.out.println("You roll a 20-sided die, your number is " + num20);

    System.out.println("The total of all the six dice you rolled are: " + (
        6 + num4 + num6 + num8 + num10 + num12 + num20));
  }

}
