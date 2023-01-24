package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/**
 * A Java program that prompts the user for an integer, then asks the user to
 * enter that many values. The program stores these values in an array and print
 * the array. Then the array elements are reversed so that the first element
 * becomes the last element, second becomes second to last, and so on, with the
 * old last element now first.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class ReverseArray {

    static void reverse(int[] a, int n) {
        
        int[] b = new int[n];
        int j = n;
        
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        
        System.out.println("\nThe reverse array is:");
        for (int k = 0; k < n; k++) {
            
            System.out.print(b[k] + " ");
        }
    }
    
    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of elements you want to store: ");
        int n = scan.nextInt();
        
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        
        // Normal: 6
        System.out.println("\nArray elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        
        // Reverse:
        reverse(array, array.length);
        
        scan.close();
    }

}
