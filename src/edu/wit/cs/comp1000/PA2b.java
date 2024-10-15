package edu.wit.cs.comp1000;

import java.util.Scanner;

/**
 * Solution to the third programming assignment part b.
 * This program calculates the roots of a quadratic equation
 * given coefficients a, b, and c.
 * It determines if the roots are real or imaginary and 
 * outputs the results accordingly.
 * 
 * @author Zaid Jilla
 */


// TODO: document this class.
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a b c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        double d = (b*b)-4*a*c;
        
        if (d < 0) {
            System.out.println("Roots: imaginary");
        }
        // Check if d is zero (one repeated root)
        else if (d == 0) {
            double r = -b / (2 * a);
            System.out.printf("Root: %.2f%n", r);
        }
        // If discriminant is positive (two real roots)
        else {
            double r1 = (-b - Math.sqrt(d)) / (2 * a);
            double r2 = (-b + Math.sqrt(d)) / (2 * a);
            
            // Ensure r1 is the smaller root
            if (r1 > r2) {
                double swap = r1;
                r1 = r2;
                r2 = swap;
            }
            
            System.out.printf("Roots: %.2f, %.2f%n", r1, r2);
        }
        
	}

}
