//23. Write a JAVAprogram to find sum of all even numbers between 1 to 
import java.util.Scanner;
class Sumeven 
{
    public static void main(String args[])
    {
        Scanner mn=new Scanner(System.in);
        int i=1,n,sum=0;
        System.out.print("Enter the value: ");
        n = mn.nextInt();
        for (i = 1; i <= n; i++) 
        {
            
            if (i % 2 == 0) 
            {
                sum = sum + i;
            }
        }
        
      
        System.out.println("The sum of all even numbers is: " + sum);
        
       
    }
}