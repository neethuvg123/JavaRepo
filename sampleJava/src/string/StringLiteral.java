package string;

public class StringLiteral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="neethu";
String s2="neethu";
String s3="Neethu";
String s4= new String("java");
String s5=new String("java");
//System.out.println(s1 +" "+s2);
System.out.println(s1.equals(s2));//true (compares values in s1 and s2)
System.out.println(s1.equals(s3));
System.out.println(s4.equals(s5));



System.out.println(s1==s2);//(compares variables in s1 and s2)
System.out.println(s4==s5);
	}

}
