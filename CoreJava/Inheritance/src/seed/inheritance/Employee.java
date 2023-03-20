//Package Definition
package seed.inheritance;
//Parent Class Definition
public class Employee {
	
	//Instance Variables
		int id,sal;
		String name;
	//No Argument Constructor
	public Employee(){
		    super();
			id=0;
			sal=00;
			name="x";
	}
	//Constructor Method with parameters using this keyword
	public Employee(int id,int sal,String name){
			super();
		    this.id=id;
			this.sal=sal;
			this.name=name;	
	}
	//Print Method
	public void printEmployee(){
	 System.out.println("Employee DETAILS"+" "+id+" "+sal+" "+name);
	}
	public void CalSal(){
		System.out.println("Salary"+" "+sal);
	}
}
