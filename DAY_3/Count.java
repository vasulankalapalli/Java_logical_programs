 //26)Write a JAVAprogram to count number of digits in a number.
import java.util.Scanner;
class Count

{
    public static void main(String[] args) 
    {
        
        Scanner mn = new Scanner(System.in);
        int n,count = 0;
        System.out.print("Enter an integer: ");
        n = mn.nextInt();
        if (n == 0) 
        {
            count = 1;
        } 
        else 
        {
            n = Math.abs(n);
            while (n > 0)
            {
                n /= 10;
                count++;
            }
        }
        System.out.println("The number of digits is: " + count);
    }
}