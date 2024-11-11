//39. Write a JAVAprogram to check whether a number is Prime number or not.
import java.util.Scanner;

class Prime 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        if (isPrime(number))
        {
            System.out.println(number + " is a prime number.");
        } else 
        {
            System.out.println(number + " is not a prime number.");
        }
    }

   
    public static boolean isPrime(int num) 
    {
     
        if (num <= 1) 
        {
            return false;
        }

        for (int i = 2; i < num; i++) 
        {
            if (num % i == 0) 
            {
                return false; 
            }
        }
        return true; 
    }
}