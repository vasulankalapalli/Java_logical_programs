import java.util.Scanner;
class Circle
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
float PI=3.14F;
float r,area;
System.out.println("Enter the radius of the circle");
r=obj.nextFloat();
area=PI*r*r;
System.out.println("The area of the circle is :"+area);
}}