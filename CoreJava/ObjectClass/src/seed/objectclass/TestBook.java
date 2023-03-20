//Package Definition
package seed.objectclass;
//Driver Code
public class TestBook {
	
	public static void main(String[] args) {
		
		Book b1 = new Book();
		Book b2 = new Book(101,"Java","Pankaj");
		Book b3 = b2;
		
		//toString Method
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println("---------------------------");
	}
}
