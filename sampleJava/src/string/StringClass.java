package string;

public class StringClass {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
String s1="Hello World";

//method 1- to find the length of string
System.out.println(s1.length());


//method 2-charAt() to get charcter based on index
System.out.println(s1.charAt(1));


//method 3-valueOf() convert 
int a=123;
String a1=String.valueOf(a);// converts an interger value to string
System.out.println(a1);


String s3="123";
int s4=Integer.valueOf(s3);
System.out.println(s4);

char e='q';
String r=String.valueOf('q');
System.out.println(r);

//method 4-equals()

String s5="java";
System.out.println(s1.equals(s5));

//method 5-equalsIgnoreCase()

String s6="JAVA";
System.out.println(s5.equalsIgnoreCase(s6));

//method 6 -isEmpty() 
System.out.println(s6.isEmpty());

//method 7 concate()
System.out.println(s3.concat(s6));

//method 8 toUpperCase()
System.out.println(s5.toUpperCase());

//method 9 toLowerCase()
System.out.println(s6.toLowerCase());

//method 10 contains()
System.out.println(s1.contains("World"));


	}
}
