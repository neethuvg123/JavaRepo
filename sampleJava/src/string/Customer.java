package string;

import java.util.Scanner;

public class Customer {

		
		static double totalAmount;
		static double finalAmount;
		
		
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the prices");
		double item1= sc.nextInt();
		double item2=sc.nextInt();
		double item3= sc.nextInt();
		
		double x= Customer.total(item1,item2,item3);
		totalAmount=x;
		System.out.println("Total amount is: "+x); 
		Customer.discount();
	}

	public static double total(double item1, double item2, double item3)
	{
		 totalAmount= item1+item2+item3;
	     return totalAmount;
	}

	public static void discount()
	{ 
		if(totalAmount>=5000)
		{
			 finalAmount= totalAmount-(totalAmount*0.2);
			System.out.println("Amount to be paid after discount: "+finalAmount);
		}
		else 
		{
			System.out.println("Not Eligible for discount");
		}
		
	}
	}

