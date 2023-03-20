//Package Definition
package seed.constructor;
//Class Definition
public class Person {
	
	//Instance Variables
	int id;
	String name,address;
	//Constructor Method without parameters
	public Person(){
		id=1;
		name="Shikha Shrivastava";
		address="10, Sai Villa Apartments,maldives";
	}
	//Constructor Method with parameters using this Keyword
	public Person(int id,String name,String address){
		this.id=id;
		this.name=name;
		this.address=address;	
	}
	//Print Method
	public void printPerson(){
		System.out.println("Student DETAILS"+" "+id+" "+name+" "+address);
	}
}
