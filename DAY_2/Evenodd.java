import java.util.Scanner;
class Evenodd
{
public static void main(String args[])
{
    Scanner obj=new Scanner(System.in);
    int a;
    System.out.println("Enter the number:");
    a=obj.nextInt();
    if(a%2==0)
    {
        System.out.println("Even");
    }
    else
    {
        System.out.println("Odd");
    }
}
}