//29. Write a JAVAprogram to check whether a number is palindrome or not.
import java.util.Scanner;

class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner mn = new Scanner(System.in);
        int n,a,r,digit;
        System.out.print("Enter a number: ");
        n = mn.nextInt();
        a = n;
        r = 0;
        while (n != 0) 
        {
            digit = n % 10; 
            r = r * 10 + digit; 
            n /= 10; 
        }
        if (a == r) 
        {
            System.out.println(a + " is a palindrome.");
        } else {
            System.out.println(a + " is not a palindrome.");
        }
    }//121
}