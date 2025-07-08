package string;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		 String original;
		 String rev="";
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the string: ");
		 String s= sc.next();
		 original=s;
		 
		 for(int i=original.length()-1;i>=0;i--)
		 {
			 rev=rev+original.charAt(i);
		 }
      System.out.println("Reversed string is : "+rev);
      
      
      if(original.equalsIgnoreCase(rev))
      {
    	  System.out.println("String is Palindrome");
      }
      else
      {
    	  System.out.println("String is not Palindrome");
      }
	}

}
