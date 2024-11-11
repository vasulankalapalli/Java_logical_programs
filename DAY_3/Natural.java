//17. Write a JAVAprogram to print all natural numbers from 1 to n. - using while loop

import java.util.Scanner;
class Natural 
{
    public static void main(String args[])
    {
        Scanner mn=new Scanner(System.in);
        int i=1,n;
        System.out.println("Enter the value");
        n=mn.nextInt();
        while(i<=n)
        {
            System.out.println("The Number is:"+i);
            i++;
        }
    }
}