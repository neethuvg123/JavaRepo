package string;

import java.util.Scanner;

public class PalinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalinString obj=new PalinString();
		Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");	
			String s=sc.next();
		obj.reverse(s);
		
	}
public void reverse(String s)
{
	String original=s;
	String rev="";
	for(int i=original.length()-1;i>=0;i--)
	{
		rev=rev+original.charAt(i);
	}
	if(original.equalsIgnoreCase(rev))
	{
		System.out.println("palin");
	}
	else
	{
		System.out.println("not");
	}
}
}
