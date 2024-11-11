//41. Write a JAVAprogram to find sum of all prime numbers between 1 to n.
import java.util.Scanner;

class Primesum
 {
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number n: ");
        int n = scanner.nextInt();
        
        int sum = 0; 
        
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                sum += i; 
            }
        }
        
        System.out.println("The sum of all prime numbers between 1 and " + n + " is: " + sum);
        scanner.close();
    }
}