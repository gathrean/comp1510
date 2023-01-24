package q3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A Java program that uses the sieve of Eratosthenes to determine which numbers
 * are prime. It will ask the user to enter an upper bound; the program will
 * print out the prime numbers between 0 and that upper bound.
 *
 * @author Gathrean Dela Cruz
 * @version 1.0
 */
public class Primes {

    /**
     * Step 1. "A Boolean list called "primes" initialized with an ArrayList."
     */
    private static ArrayList<Boolean> primes = new ArrayList<Boolean>();

    /**
     * Step 2. "A constructor that accepts a single integer, N, which is used to
     * initialize the primes Arraylist to have maximum index N."
     * 
     * @param n int
     */
    public Primes(int n) {
        for (int i = 0; i <= n; i++) {
            primes.add(true);
        }
        primes = new ArrayList<>(n);
        calculatePrimes(n);
    }

    /**
     * Step 3. "The constructor should pass N to a private method called
     * calculatePrimes, which uses the Sieve of Erastothenes to determine which
     * indices are prime (true) and which are not (false).
     * 
     * @param number int
     */
    private static void calculatePrimes(int number) {

        // 0 and 1 are not prime numbers.
        primes.add(0, false);
        primes.add(1, false);
        for (int i = 2; i < number; i++) {
            primes.add(i, true);
        }
        for (int i = 2; i * i < number; i++) {
            if (primes.get(i)) {
                for (int j = i * 2; j < number; j = j + i) {
                    primes.set(j, false);
                }
            }
        }
    }

    /**
     * Step 4. "A method called printPrimes() which prints out the list of prime
     * calculated."
     */
    public void printPrimes() {
        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i)) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * Step 5. "A method called countPrimes() which returns an int representing
     * number of primes in the range [0, N]."
     * 
     * @return count int
     */
    public static int countPrimes() {
        int count = 0;
        for (boolean number : primes) {
            if (number) {
                count++;
            }
        }
        return count;
    }

    /**
     * Step 6. "A method called isPrime(int x) which returns true if x is prime,
     * false if it is not. The parameter must be in the range [0, N]."
     */
    public void isPrimes() {
        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i)) {
                System.out.println(i);
            }
        }
    }

    /**
     * <p>
     * Step 7. "(a) The main method asks the user for an upper bound, N, using a
     * Scanner object. (b) The main method uses the input value as the parameter
     * for the Primes constructor to create new Primes object. (c) The main
     * method invokes countPrimes() and prints the result. (d) The main method
     * invokes printPrimes() to print a list of prime numbers."
     * </p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("This program uses the sieve of Erasthones to "
                + "determine which numbers are prime.");
        System.out.println("Enter an upper bound: ");
        int n = scan.nextInt();
        Primes prime = new Primes(n);

        System.out.println("There are " + Primes.countPrimes() + " primes:");
        System.out.println("The prime numbers between 0 and " + n + " are:");
        prime.printPrimes();

        scan.close();

    }

}
