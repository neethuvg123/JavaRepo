package string;

import java.util.Scanner;

public class StringPalind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string");;
			String str=sc.next();
			
		
		StringPalind obj= new StringPalind();
		obj.reverse(str);
		
	}
	public void reverse(String str)
	{
		String original=str;
		String rev="";
		for(int i=original.length()-1;i>=0;i--)
		{
			//rev=original.charAt(i)+rev;
			rev=rev+original.charAt(i);
		}
		if(original.equalsIgnoreCase(rev))
		{
			System.out.println("palindrome :-"+rev);
		}
		else
		{
			System.out.println("Not palindrome:-"+original);
			System.out.println(rev);
			
			
		}
	}
}
