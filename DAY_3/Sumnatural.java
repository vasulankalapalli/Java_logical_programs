//22. Write a JAVAprogram to find sum of all natural numbers between 1 to n.

import java.util.Scanner;
class Sumnatural
{
    public static void main(String args[])
    {
        Scanner mn=new Scanner(System.in);
        int i=1,n,sum=0;
        System.out.println("Enter the value");
        n=mn.nextInt();
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("The Number is:"+i);
    }
}
