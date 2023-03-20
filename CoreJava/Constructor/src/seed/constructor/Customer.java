//Package Definition
package seed.constructor;
//Class Definition
public class Customer {
	
	//Instance Variables
	int id;
	String name,address;

	//No Parameter Constructor
	public Customer(){

	}
	//Parameterized Constructor
	public Customer(int id, String name, String address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	//Print Method
	public void printCustomer(){
		System.out.println(id+"\n"+name+"\n"+address);
	}
}
