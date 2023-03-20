//Package Definition
package seed.agreegation;
//Driver Code
public class TestCustomer {
	
  public static void main(String[] args) {
	
	//Object 1
	Customer c1=new Customer();
	//Print Person
	c1.printCustomer();
	//Date Object
	MyDate d1=new MyDate();
	//Address Object
	Address a1=new Address();
	//Object 2
	Customer c2=new Customer(2,"Arjun",d1,a1);
	//Print Person
	c2.printCustomer();
	MyDate d2=new MyDate(12,10,2023);
	Address a2=new Address(22,"Pimpri,Pune");
	//Object 3
	Customer c3=new Customer(3,"Shikha",d2,a2);
	//Print Person
	c3.printCustomer();
	//Object 4
	Customer c4=new Customer();
	//Print Person
	c4.printCustomer();
	}
}
