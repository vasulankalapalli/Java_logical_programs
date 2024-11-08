import java.util.Scanner;
class Nested
{
	public static void main(String args[])
	{
		 Scanner obj=new Scanner(System.in);
    	int a,b,c;
    	System.out.println("Enter the a number:");
    	a=obj.nextInt();
		System.out.println("Enter the b number:");
    	b=obj.nextInt();
		System.out.println("Enter the c number:");
    	c=obj.nextInt();
		
	if(a>b)
	{
		if(a>c)
		{
			System.out.println("a is big");
		}
		else
		{
			System.out.println("c is big");
		}
	}
	else
	{
		if(b>c)
		{
			System.out.println("b is big");
		}
		else
		{
			System.out.println("c is big");
		}
	}
	}
}
