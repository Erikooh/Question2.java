// Question 2: Fitness App - Determine Fitness Level
// Author: Erick
// Date: Nov 24, 2025

import java.util.Scanner;

public class Question2 {

    // Method to determine fitness level based on steps
    public static String getFitnessLevel(int steps) {
        if (steps >= 10000) {
            return "Excellent";
        } else if (steps >= 7000) {
            return "Good";
        } else if (steps >= 4000) {
            return "Average";
        } else {
            return "Poor";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter your steps for today: ");
        int steps = scanner.nextInt();

        // Call method and display result
        String fitnessLevel = getFitnessLevel(steps);
        System.out.println("Your fitness level: " + fitnessLevel);

        scanner.close();
    }
}
