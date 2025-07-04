package string;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Factorial obj=new Factorial();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the factorial:");
		int a=sc.nextInt();
			obj.fact(a);	
     }
	
public void fact(int a)
{
	int facto=1;
	for(int i=1;i<=a;i++)
	{
		facto=facto*i;
	}
	System.out.println("Factorial of the number is: "+facto);
}
}
