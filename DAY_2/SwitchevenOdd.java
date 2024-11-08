import java.util.Scanner;
class Switchevenodd 
{
    public static void main(String args[]) 
    {
       Scanner obj=new Scanner(System.in);
    		int a;
    		System.out.println("Enter the number:");
   			 a=obj.nextInt();
        switch (a % 2) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}