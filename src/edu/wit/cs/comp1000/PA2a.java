package edu.wit.cs.comp1000;

import java.util.Scanner;

/**
 * The PA2a program reads five whole numbers from the user and calculates:
 * - The sum and average of positive numbers.
 * - The sum and average of non-positive numbers.
 * - The sum and average of all five numbers.
 * The output is formatted to display averages with two decimal places.
 *
 * @author Zaid Jilla
 */


// TODO: document this class.
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
        Scanner input = new Scanner(System.in);
        
        // Variables for sums and counts
        int sumPos = 0, sumNonPos = 0, sumAll = 0;
        int countPos = 0, countNonPos = 0;
        
        // Read five integers from the user
        System.out.print("Enter five whole numbers: ");
        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            sumAll += num;
            
            if (num > 0) {
                sumPos += num;
                countPos++;
            } else {
                sumNonPos += num;
                countNonPos++;
            }
        }
        
        // Calculate averages
        double avgPos = countPos > 0 ? (double) sumPos / countPos : 0.0;
        double avgNonPos = countNonPos > 0 ? (double) sumNonPos / countNonPos : 0.0;
        double avgAll = (double) sumAll / 5;

        // Determine "number" or "numbers" for proper grammar
        String posWord = countPos == 1 ? "number" : "numbers";
        String nonPosWord = countNonPos == 1 ? "number" : "numbers";

        // Output the results
        System.out.println("The sum of the " + countPos + " positive " + posWord + ": " + sumPos);
        System.out.println("The sum of the " + countNonPos + " non-positive " + nonPosWord + ": " + sumNonPos);
        System.out.println("The sum of the 5 numbers: " + sumAll);
        System.out.printf("The average of the %d positive %s: %.2f%n", countPos, posWord, avgPos);
        System.out.printf("The average of the %d non-positive %s: %.2f%n", countNonPos, nonPosWord, avgNonPos);
        System.out.printf("The average of the 5 numbers: %.2f%n", avgAll);
        
        input.close();
    }
}
