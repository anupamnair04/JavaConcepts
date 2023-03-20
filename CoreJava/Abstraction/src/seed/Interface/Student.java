package seed.Interface;
//Sub Class Definition
public class Student implements Printtable {
   int roll;
   String name;
   
    public Student() {
		super();
		roll = 0;
		name = "xxxx";
	}
    public Student(int roll, String name) {
	super();
	this.roll = roll;
	this.name = name;
    }

	@Override
	public void print() {
		System.out.println("Student Details"+" "+roll+" "+name);
	}
}
