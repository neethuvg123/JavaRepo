package string;

import java.util.Scanner;

public class Palindrome {
	int num;

	public static void main(String[] args) {
		
		 Palindrome obj=new  Palindrome();
				 Scanner sc=new Scanner(System.in);
				 System.out.println("Enter the number:-");
				 int num=sc.nextInt();
				obj.reverse(num);
									 }
	
	public void reverse(int num)
	{
		int a;
		int rev=0;
		this.num=num;
		while(num>0)
		{
			a=num%10;
			rev=rev*10+a;
			num=num/10;
		}
		
		System.out.println("Reversed number is:"+rev);
		this.palin(rev);
	}
	
public void palin(int rev)
{
	if(num==rev)
	{
		System.out.println("****Palindrome:****");
	}
	
		else {
			System.out.println("!!!!Not Palindrome:!!!!!");
		}
}
}

