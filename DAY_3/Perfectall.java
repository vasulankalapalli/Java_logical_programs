//46. Write a JAVAprogram to print all Perfect numbers between 1 to n.
import java.util.Scanner;

class Perfectall {

    // Method to check if a number is a perfect number
    public static boolean isPerfect(int number) {
        int sum = 0;
        
        // Find all divisors and sum them up
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i; // Add the divisor to the sum
            }
        }
        
        // A number is perfect if the sum of its divisors equals the number
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a number n: ");
        int n = scanner.nextInt();
        
        System.out.println("Perfect numbers between 1 and " + n + " are:");

        // Loop through all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " "); // Print the perfect number
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}