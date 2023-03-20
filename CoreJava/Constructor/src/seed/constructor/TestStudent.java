//Package Definition
package seed.constructor;
//Driver Class
public class TestStudent {
	
	public static void main(String[] args) {
		
		//Object Creation without parameter
		Student d1=new Student();
		//Print Object
		d1.printStudent();

		//Object Initialization with parameter
		Student d2=new Student(12);
		//Print Object
		d2.printRollNum();

		Student d3=new Student(45,88.9f);
		//Print Object
		d3.printMarks();

		Student d4=new Student(33,"Shikha",33.3f);
		//Print Object
		d4.printName();
	}
}
