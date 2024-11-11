//42. Write a JAVAprogram to find all prime factors of a number.
import java.util.Scanner;

public class Primefactors 
{

    
    public static void primeFactors(int n) 
    {
       
        while (n % 2 == 0) 
        {
            System.out.print(2+" ");
            n /= 2; 
        }

       
        for (int i = 3; i <= Math.sqrt(n); i += 2) 
        {
            
            while (n % i == 0) 
            {
                System.out.print(i + " ");
                n /= i; 
            }
        }

     
        if (n > 2) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.print("The prime factors of " + number + " are: ");
        primeFactors(number);
        
      
    }
}