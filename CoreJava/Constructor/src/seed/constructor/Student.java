//Package Definition
package seed.constructor;
//Class Definition
public class Student {
	
	//Instance Variable
	int r_num;
	String name;
	float marks;
	//Constructor without parameter
	public Student(){
		r_num=11;
		name="Anand";
		marks=67.8f;
	}
	//Constructor without parameter
	public Student(int r_num){
		this();
		this.r_num=r_num;
	}
	//Constructor with two parameter
	public Student(int r_num,float marks){
		this(r_num);
		this.marks=marks;
	}
	//Constructor with three parameter
	public Student(int r_num,String name,float marks){
		this(r_num,marks);
		this.name=name;
	}
	//Print MyDate
	public void printStudent(){
		System.out.println(r_num+" "+name+" "+marks);
	}
	//Print Date
	public void printRollNum(){
		System.out.println(r_num);
	}
	//Print Year
	public void printMarks(){
		System.out.println(marks);
	}
	//Print Month
	public void printName(){
		System.out.println(name);
	}	 
}
