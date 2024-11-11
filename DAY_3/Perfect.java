//45. Write a JAVAprogram to check whether a number is Perfect number or not.
import java.util.Scanner;
class Perfect 
{

    public static boolean isPerfect(int number) 
    {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) 
        {
            if (number % i == 0) 
            {
                sum += i; 
            }
        }
        
        
        return sum == number;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isPerfect(number)) 
        {
            System.out.println(number + " is a perfect number.");
        } else 
        {
            System.out.println(number + " is not a perfect number.");
        }
    }
}