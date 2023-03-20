//Package Definition
package seed.serialization;
//Import Java IO Library
import java.io.*;
//Class Definition
public class DemoStudent implements Serializable{

	/**/
	private static final long serialVersionUID = 1L;
	String nm;
	int id;
	transient int marks;
	
	public DemoStudent(){
		super();
	}
	public DemoStudent(String nm, int id, int marks){
		
		super();
		this.nm=nm;
		this.id=id;
		this.marks=marks;
	}
	public void display(){
		System.out.println("Student Name:"+nm);
		System.out.println("Student ID:"+id);
		System.out.println("Student Marks:"+marks);
	}
}
