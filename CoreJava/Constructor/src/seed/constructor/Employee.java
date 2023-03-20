//Package Definition
package seed.constructor;
//Class Definition
public class Employee {
	
	//Instance Variables
	int id,sal;
	String name;
	//Static Variables
	static String state="MH";
	//Constructor Method without parameters
	public Employee(){
		id=1;
		sal=12000;
		name="Rakeesh";
		state="MH";
	}
	//Constructor Method with parameters using this keyword
	public Employee(int id,int sal,String name){
		this.id=id;
		this.sal=sal;
		this.name=name;	
	}
	//Print Method
	public void printEmployee(){
		System.out.println("Employee DETAILS"+" "+id+" "+sal+" "+name+" "+Employee.state);
	}
	//Manipulate Static Variables
	public static void change_state(String sname){
		state=sname;
	}
}
