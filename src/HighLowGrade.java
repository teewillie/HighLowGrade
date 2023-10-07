/**
 * @class: HighLowGrade
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 6, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 *
 * Description:
 */

import java.util.Scanner;

public class HighLowGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highest = Integer.MIN_VALUE; // Initialize with the smallest possible integer value
        int lowest = Integer.MAX_VALUE;  // Initialize with the largest possible integer value

        System.out.println("Enter student grades (enter 'c' to stop):");

        while (true) {
            String input = scanner.next();

            // Check if the input is 'c' to stop entering grades
            if (input.equalsIgnoreCase("c")) {
                break;
            }

            try {
                int grade = Integer.parseInt(input);

                // Update the highest and lowest grades if necessary
                if (grade > highest) {
                    highest = grade;
                }
                if (grade < lowest) {
                    lowest = grade;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a grade or 'c' to stop.");
            }
        }

        scanner.close();

        if (highest != Integer.MIN_VALUE && lowest != Integer.MAX_VALUE) {
            System.out.println("Highest student grade is " + highest);
            System.out.println("Lowest student grade is " + lowest);
        } else {
            System.out.println("No grades entered.");
        }
    }
}
