import java.util.Scanner;

class Product
  {
    public static void main(String args[])
     {
        Scanner obj=new Scanner(System.in);
	int pno;
	String pname;
	double pcost;
	double pquan;
	double bill;

	System.out.println("Enter the Product Number:");
	pno=obj.nextInt();
	System.out.println("Enter the Product Name:");
	pname=obj.next();
	System.out.println("Enter the Product Cost:");
	pcost=obj.nextDouble();
	System.out.println("Enter the Product Weight in KiloGrams:");
	pquan=obj.nextDouble();
	bill=pcost*pquan;
	
	System.out.println("The Given Product Number:"+pno);
	System.out.println("The Given Product Name:"+pname);
	System.out.println("The Given Product Cost:"+pcost);
	System.out.println("The Given Product Weight in KiloGrams:"+pquan);
	System.out.println("TOTAL BILL IS:"+bill);
	}
}