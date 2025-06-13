package string;

public class StringBuffer1 {
	public static void main(String[] args) {
		
		StringBuffer buff =new StringBuffer("hello");
		System.out.println(buff);
		
		//method 1 append()
		System.out.println(buff.append("world"));
		
		//method 2 insert()
		System.out.println(buff.insert(5,'o'));
		
		//method 3 replace()
		System.out.println(buff.replace(7,9, "vmh"));
		
		//method 4 delete()
		System.out.println(buff.delete(6, 12));	
		
		//method 5 reverse()
		System.out.println(buff.reverse());
		
		//method 6 capacity()
		StringBuffer buff1 =new StringBuffer("");
		System.out.println(buff1.capacity());
		System.out.println(buff.capacity());
		
		//method 7 subString()
		System.out.println(buff.substring(3));
		
}
}
