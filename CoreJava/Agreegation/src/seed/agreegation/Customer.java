//Package Definition
package seed.agreegation;
//Class Definition Customer
public class Customer {
	
	//Instance Variable
	int id;
	String name;
	MyDate date;
	Address address;
	//No Argument Constructor
	public Customer() {		
	    id=1;
	    name="Anupam";
	    date=new MyDate();
	    address=new Address();
	}
	public Customer(int id, String name, MyDate date, Address address) {	
		this.id = id;
		this.name = name;
		this.date = date;
		this.address=address;
	}
	//Print Method
	public void printCustomer(){
	System.out.println("ID:"+id+" "+"Name:"+name+" "+date.printMyDate()+address.printAddress());
	}
}