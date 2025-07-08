package string;

public class Reverse {
    int num;
	public static void main(String[] args) {
		Reverse obj=new Reverse();
		obj.reverse(121);
		
	}
public void reverse(int num)
{   this.num=num;
	int a;
	int rev=0;
	while (num>0)
	{
		a=num%10;
		rev=rev*10+a;
		num=num/10;
	}
	System.out.println("reversed num :"+rev);
	this.palindrome(rev);
}
 public void palindrome(int rev)
 {
	 if(rev==num)
	 {
		 System.out.println("palindrome "+num);
	 }
	 else
	 {
		 System.out.println("Not palindrone :"+rev);
	 }
 }

}
