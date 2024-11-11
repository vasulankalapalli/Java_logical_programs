//40. Write a JAVAprogram to print all Prime numbers between 1 to n.
import java.util.Scanner;
class Primeall 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers between 1 and " + n + " are:");

    
        for (int i = 2; i <= n; i++) 
        {
            if (isPrime(i)) 
            {
                System.out.print(i + " \n"); 
            }
        }
    }

    public static boolean isPrime(int num) 
    {
        if (num <= 1) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0) 
            {
                return false; 
            }
        }
        return true; 
    }
}