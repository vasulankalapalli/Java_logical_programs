//43. Write a JAVAprogram to check whether a number is Armstrong number or not.
import java.util.Scanner;

class Armstrong 
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
        
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
      
        if (isArmstrong(number)) 
        {
            System.out.println(number + " is an Armstrong number.");
        } else 
        {
            System.out.println(number + " is not an Armstrong number.");
        }
        
       
    }
}