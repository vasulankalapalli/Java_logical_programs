//25. Write a JAVAprogram to print multiplication table of any number.
import java.util.Scanner;
class Multiplication 
{
    public static void main(String args[])
    {
        Scanner mn=new Scanner(System.in);
        int i=1,n;
        System.out.println("Enter n value");
        n=mn.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+"="+i*n);
        }
    }
}