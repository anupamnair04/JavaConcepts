//Package Definition
package seed.constructor;
//Class Definition
public class Book {
	
	//Instance Variables
	int id;
	String name,publication;
	//Static Variables
	static String state="MH";
	static int b_count;
	//Constructor Method without parameters
	public Book(){
		id=12;
		name="JAVA";
		publication="Pune";
		//Using Static Variable to count number of books
		b_count++;
	}
	/*Constructor Method with parameters
	public Book(int bid,String bname,String pname){
		id=bid;
		name=bname;
		publication=pname;
	}*/
	//Constructor Method with parameters using this
	public Book(int id,String name,String publication){
		this.id=id;
		this.name=name;
		this.publication=publication;
		//Using Static Variable to count number of books
		b_count++;
	}
	//Print Method
	public void printBook(){
		System.out.println("BOOK DETAILS"+" "+id+" "+name+" "+publication+" "+Book.state+" "+Book.b_count+" "+Book.state);
	}
	//Manipulate Static Variables
	public static void change_state(String sname){
		state=sname;
	}
}
