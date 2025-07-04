package string;

import java.util.Scanner;

public class Fibonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonocci obj=new Fibonocci ();
		Scanner sc=new Scanner(System.in);
			System.out.println("enter the limit");	
			int num=sc.nextInt();
			obj.fib(num);
	}
public void fib(int num)
{
	int first=0;
	int second=1;
	int next;
	System.out.println(first);
	System.out.println(second);
	for(int i=3;i<=num;i++)
	{
		next=first+second;
		//System.out.println(next);
		first=second;
		second=next;
		System.out.println(next);
		
	}
	
}
}
