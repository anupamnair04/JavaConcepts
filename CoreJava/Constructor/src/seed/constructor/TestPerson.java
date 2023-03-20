//Package Definition
package seed.constructor;
//Driver Code
public class TestPerson {
	
	public static void main(String[] args) {
		
		//Object Creation without parameter
		Person p1=new Person();
		//Print Object
		p1.printPerson();

		//Object Initialization with parameter
		Person p2=new Person(19,"Suresh Desai","25,Patel Society,Palanpur");
		//Print Object
		p2.printPerson();			
	}
}
