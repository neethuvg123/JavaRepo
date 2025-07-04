package string;

public class Amstrong {

	int num;
	public static void main(String[] args) {
		Amstrong obj=new Amstrong();
		obj.amstrong(153);
	
	}
	
	



public void amstrong(int n)
{
//int num=n;
	this.num=n;

int digit;
int amstr=0;

while(n>0)
{
	digit=n%10;
	int a=digit*digit*digit;
	amstr=amstr+a;
	n=n/10;
}

if(amstr==num) 
{
	System.out.println("amstrong number");
}
else
{
	System.out.println("not");
}
}
}



