//38. Write a JAVAprogram to calculate factorial of a number.
import java.util.Scanner;
class Factorial
{
    public static void main(String args[])
    {
        Scanner mn=new Scanner(System.in);
        int i=1,n,mul=1;
        System.out.println("Enter a Value:");
        n=mn.nextInt();
        while(i<=n)
        {
            mul=mul*i;
            i++;
        }
        System.out.println("The Factorial Number is:"+mul);
    }
}