import java.util.Scanner;
class Marks
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
int sno,m,p,c,tot;
String sname;
float avg;
System.out.println("Enter the Student Number:");
sno=obj.nextInt();
System.out.println("Enter the Student Name:");
sname=obj.next();
System.out.println("Enter the Maths Marks:");
m=obj.nextInt();
System.out.println("Enter the Physics Marks:");
p=obj.nextInt();
System.out.println("Enter the Chemistry Marks:");
c=obj.nextInt();
tot = m + p + c;
avg = tot / 3;
System.out.println("The Given Student Number is :"+sno);
System.out.println("The Given Student Name is :"+sname);
System.out.println("The Given Maths Marks is :"+m);
System.out.println("The Given Physics Marks is :"+p);
System.out.println("The Given Chemistry Marks is :"+c);
System.out.println("The Total Marks is :"+tot);
System.out.println("The Average Marks is :"+avg);
}}