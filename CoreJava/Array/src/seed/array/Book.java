//Package Definition
package seed.array;
//Class Definition
public class Book {
	
	//Instance variable
	int id;
	String name;
	//No Argument Constructor
	public Book() {
		id = 1;
		name = "Java";
	}  
	//Parameterized Constructor
	public Book(int id, String name) {
		this.id = id;
		this.name = name;
	}
	//Print Method
	public void printBook(){
		System.out.println("Id:"+" "+id+"\n"+"Name:"+name);
	}
}
