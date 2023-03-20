//Package Definition
package seed.encapsulation;
//Driver Code
public class TestPerson {
	
	public static void main(String[] args) {
		
		//Create Object
		Person a1=new Person();
		//Set Value
		a1.setId(180390);
		a1.setName("Swara");
		a1.setAge(-1);
		//Get Value
		a1.getId();
		a1.getName();
		a1.getAge();
		//Call Print
		a1.printPerson();
	}
}
