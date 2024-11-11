//49. Write a JAVAprogram to print Fibonacci series up to n terms
import java.util.Scanner;

class Fibonacci {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt(); 
        System.out.println("Fibonacci series up to " + n + " terms:");

        int firstTerm = 0; 
        int secondTerm = 1; 

        
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " "); 

            
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm; 
            secondTerm = nextTerm;   
        }


    }
}