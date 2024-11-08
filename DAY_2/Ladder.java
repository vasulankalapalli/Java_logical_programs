import java.util.Scanner;
class Ladder
{
    public static void main(String args[]) 
	{
		 Scanner obj=new Scanner(System.in);
    		int a;
    		System.out.println("Enter the number:");
   			 a=obj.nextInt();
			 
       		 if (a == 1) 
			{
          	  	System.out.println("The Day is Monday");
      		} 	
		else if (a == 2) 
			{
            		System.out.println("The Day is Tuesday");
        	} 
		else if (a == 3) 
			{
    		        System.out.println("The Day is Wednesday");
        	} 
		else if (a == 4) 
			{
        		System.out.println("The Day is Thursday");
        	} 
		else if (a == 5) 
			{
            		System.out.println("The Day is Friday");
        	} 
		else if (a == 6) 
			{
            		System.out.println("The Day is Saturday");
        	} 
		else if (a == 7) 
			{
            		System.out.println("The Day is Sunday");
        	} 
		else 
			{
            		System.out.println("Invalid Input");
        	}
    	}
}
