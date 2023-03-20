//Package Definition
package seed.constructor;
//Driver Class
public class TestEmployee {
	
	public static void main(String[] args) {
		
		//Object Creation without parameter
		Employee e1=new Employee();
		//Print Object
		e1.printEmployee();

		Employee.change_state("UP");
		//Object Initialization with parameter
		Employee e2=new Employee(2,13000,"Suresh");
		//Print Object
		e2.printEmployee();

		Employee.change_state("GUJ");
		//Object Initialization with parameter
		Employee e3=new Employee(3,25000,"Dharam");
		//Print Object
		e3.printEmployee();
	}
}
