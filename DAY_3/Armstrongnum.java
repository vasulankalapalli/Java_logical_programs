//44. Write a JAVAprogram to print all Armstrong numbers between 1 to n.
import java.util.Scanner;
class Armstrongnum
{

    
    public static boolean isArmstrong(int number) 
    {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length(); 

      
        while (number > 0) 
        {
            int digit = number % 10; 
            sum += Math.pow(digit, digits); 
            number /= 10; 
        }

       
        return sum == originalNumber;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number n: ");
        int n = scanner.nextInt();
        
        System.out.println("Armstrong numbers between 1 and " + n + " are:");
        for (int i = 1; i <= n; i++) 
        {
            if (isArmstrong(i)) 
            {
                System.out.print(i + " ");
            }
        }
        
    }
}