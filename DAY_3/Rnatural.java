//18. Write a JAVAprogram to print all natural numbers in reverse (from n to 1). -     using while loop

import java.util.Scanner;
class Rnatural 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        if (n <= 0) 
        {
            System.out.println("Enter a natural number greater than 0");
        } 
        else 
        {
            int i = n;
            while (i >= 1) {
                System.out.println(i);
                i--;
            }
        }
    }
}