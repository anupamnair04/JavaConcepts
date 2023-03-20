//Package Definition
package seed.constructor;
//Driver Class
public class TestBook {
	
	public static void main(String[] args) {
		
		//Object Creation without parameter
		Book b1=new Book();
		//Print Object
		b1.printBook();

		Book.change_state("UP");
		//Object Initialization with parameter
		Book b2=new Book(29,"C++","Bhagalpur");
		//Print Object
		b2.printBook();

		Book.change_state("GUJ");
		//Object Initialization with parameter
		Book b3=new Book(30,"JAVA","Palanpur");
		//Print Object
		b3.printBook();	
	}
}
