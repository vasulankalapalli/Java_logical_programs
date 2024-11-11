//28. Write a JAVAprogram to find sum of first and last digit of a number.
import java.util.Scanner;

class Flsum 
{
    public static void main(String[] args) 
    {
        Scanner mn = new Scanner(System.in);
        int n,f,l,sum=0;
        System.out.print("Enter a number: ");
        n = mn.nextInt();
        l = n % 10;
        f = n;
        while (f >= 10) 
        {
            f /= 10;
        }
        sum = f + l;
        System.out.println("First digit: " + f);
        System.out.println("Last digit: " + l);
        System.out.println("Sum of first and last digit: " + sum);
    }
}