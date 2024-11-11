//36. Write a JAVAprogram to find power of a number using for loop.
import java.util.Scanner;
class Power 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double base,result=1;
        int e,i;
        System.out.print("Enter the base: ");
        base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        e = scanner.nextInt();
        for (i = 1; i <= e; i++) 
        {
            result *= base;
        }
        System.out.println(base + " raised to the power of " + e + " is: " + result);
    }
}