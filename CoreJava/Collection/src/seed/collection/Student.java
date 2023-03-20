//Package Definition
package seed.collection;
//Class Definition
public class Student {
	
	//Instance Variable
	int roll;
	String name;
	private int marks;
	//No Arg Constructor
	public Student(){
		roll = 0;
		name ="xxx";
	}
	//Parameterized Constructor
	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	public Student(int roll, String name,int marks) {
		this.roll = roll;
		this.name = name;
		this.marks=marks;
	}
	//Print Method
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
}
