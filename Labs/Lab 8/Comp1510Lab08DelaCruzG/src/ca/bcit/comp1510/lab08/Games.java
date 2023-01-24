package ca.bcit.comp1510.lab08;

import java.util.Scanner;

import java.util.Random;

/**
 * A Java program that uses the Random class and luck to make easy, fun games.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 */
public class Games {

    /** Number in guessing range. **/
    private static final int MAX = 100;

    /**
     * Initializes the user score.
     */
    private static int userScore;

    /**
     * Instantiates the Scanner object.
     */
    private Scanner scan = new Scanner(System.in);

    /**
     * Instantiate the Random object.
     */
    private Random random = new Random();

    /**
     * Play method.
     */
    public void play() {

        int userInput;
        do {
            System.out.println("Welcome to the Games program!");
            System.out.println("Make your choice (enter a number)");
            System.out.println("1. See your score");
            System.out.println("2. Guess a number");
            System.out.println("3. Play Rock, Paper, Scissors");
            System.out.print("4. Quit\n> ");
            userInput = scan.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("Your score is " + userScore);
                    break;
                case 2:
                    guessANumber();
                    break;
                case 2 + 1:
                    rockPaperScissors();
                    break;
                case 2 + 2:
                    break;
                default:
                    System.out.println("Wrong number. Try again.");
                    userInput = scan.nextInt();
            }
        } while (userInput > 0 && userInput < 2 + 2);

    }

    /**
     * Called when user enters 2.
     */
    public void guessANumber() {
        int answer;
        int guess;
        int turn = 0;

        answer = random.nextInt(MAX) + 1;

        System.out.println("I've picked a random number between 0 and " 
                + MAX + ".\nCan you guess it?");

        System.out.println("Guess the number!");

        guess = scan.nextInt();

        do {
            if (guess > answer) {
                System.out.println("Too high, guess again!");
                System.out.println("Guess the number!");
                guess = scan.nextInt();
                turn++;
                
            } else if (guess < answer) {
                System.out.println("Too low, guess again!");
                System.out.println("Guess the number!");
                guess = scan.nextInt();
                turn++;
                
            } else if (guess < 1 || guess > MAX) { 
                System.out.println("Invalid input");
                guess = scan.nextInt();
                turn++;
                
            }
        } while (guess != answer);
        
        if (guess == answer && turn > 2 + 2 + 1) {
            System.out.println("RIGHT!\nOne point!");
            userScore++;
            
        } else {
            System.out.println("RIGHT!\nFive points!");
            userScore = userScore + 2 + 2 + 1;
        }

    }
    
    /**
     * Rock Paper Scissors game.
     */
    public void rockPaperScissors() {

        int randomRPS = random.nextInt(2 + 1);
        System.out.println("I've picked one of ROCK, PAPER, and SCISSORS");
        System.out.print("Which one do you choose?\n> ");
        String user = scan.next();

        String ai = null;

        switch (randomRPS) {
            case 0:
                ai = "rock";
                break;
            case 1:
                ai = "paper";
                break;
            case 2:
                ai = "scissors";
                break;
            default:
                System.out.println(ai);
        }
        
        /* Rock */
        if (user.equals("rock") && ai.equals("paper")) {
            System.out.println("Nope I picked " + ai + "!");
            userScore -= 2 + 1;
        }
        if (user.equals("rock") && ai.equals("scissors")) {
            System.out.println("Yes! " + user + " smashes " + ai + "!");
            userScore += 2 + 2 + 1;
        }
        
        /* Paper */
        if (user.equals("paper") && ai.equals("scissors")) {
            System.out.println("Nope I picked " + ai + "!");
            userScore -= 2 + 1;
        }
        if (user.equals("paper") && ai.equals("rock")) {
            System.out.println("Yes! " + user + " wraps " + ai + "!");
            userScore += 2 + 2 + 1;
        }
        
        /* Scissors */
        if (user.equals("scissors") && ai.equals("rock")) {
            System.out.println("Nope I picked " + ai + "!");
            userScore -= 2 + 1;
        }
        if (user.equals("scissors") && ai.equals("paper")) {
            System.out.println("Yes! " + user + " cuts " + ai + "!");
            userScore += 2 + 2 + 1;
        }
        
        /* Tied */
        if (user.equals(ai)) {
            System.out.println("Tied! Try again!");
        }

    }
}



