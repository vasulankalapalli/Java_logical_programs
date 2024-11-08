import java.util.Scanner;
class Vowels
{
public static void main(String args[])
{
 Scanner obj=new Scanner(System.in);
    		char ch;
    		System.out.println("Enter the Alphabetic letter:");
   			  ch = obj.next().charAt(0);
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
{
	System.out.println("Vowels");
}
else
{
	System.out.println("Consonants");
}
}
}