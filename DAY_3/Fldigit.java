//27. Write a JAVAprogram to find first and last digit of a number.
import java.util.Scanner;

class Fldigit 
{
    public static void main(String[] args) 
    {
        Scanner mn = new Scanner(System.in);
        int n,ld,fd;
        System.out.print("Enter a number: ");
        n= mn.nextInt();
        ld = n % 10;
        fd = n;
        while (fd >= 10) 
        {
            fd /= 10;
        }
        System.out.println("First digit: " + fd);
        System.out.println("Last digit: " + ld);
    }
}