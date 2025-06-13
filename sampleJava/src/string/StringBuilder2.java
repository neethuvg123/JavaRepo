package string;

public class StringBuilder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder builder =new StringBuilder("Helloo");
System.out.println(builder);

//method append()
System.out.println(builder.append(" world"));

//method 2 insert()
System.out.println(builder.insert(8,'h'));

//method 3 delete()
System.out.println(builder.delete(7, 9));

//method 4 replace()
System.out.println(builder.replace(7,11, "java"));

//method 5 reverse()
System.out.println(builder.reverse());

//method 6 capacity()
System.out.println(builder.capacity());	

StringBuilder builder2 =new StringBuilder("");
System.out.println(builder2.capacity());
	
	}
}
