//31. Write a JAVAprogram to calculate product of digits of a number.
import java.util.Scanner;

class Muld
{
    public static void main(String[] args) 
    {
        Scanner mn = new Scanner(System.in);
        int n,sum=1,digit;
        System.out.print("Enter a number: ");
        n = mn.nextInt();
        while (n != 0) 
        {
            digit = n % 10; 
            sum = sum * digit;   
            n /= 10;   
        }
       System.out.println("Sum of digits: " + sum);
    }
}