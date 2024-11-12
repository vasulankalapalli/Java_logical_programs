//51. Write a JAVAprogram to find second largest element in an array.
import java.util.Scanner;

public class Largest 
{
    public static void main(String[] args) 
    {
        Scanner mn = new Scanner(System.in);
        int n,i;
        System.out.print("Enter the number of elements in the array: ");
        n = mn.nextInt();

        
        if (n < 2) 
        {
            System.out.println("Array must contain at least two elements to find the second largest element.");
            return;
        }
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) 
        {
            numbers[i] = mn.nextInt();
        }
        int secondLargest = findSecondLargest(numbers);
        if (secondLargest != Integer.MIN_VALUE) 
        {
            System.out.println("The second largest element is: " + secondLargest);
        } else 
        {
            System.out.println("There is no second largest element in the array.");
        }
    }

    public static int findSecondLargest(int[] array) 
    {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : array) 
        {
            if (number > largest) 
            {
                secondLargest = largest;
                largest = number; 
            } else if (number > secondLargest && number < largest) 
            {
                secondLargest = number; 
            }
        }

        return secondLargest;
    }
}