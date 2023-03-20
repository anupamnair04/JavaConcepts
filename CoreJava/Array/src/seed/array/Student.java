//Package Definition
package seed.array;
//Class Definition
public class Student {
	
	 //Instance Variable
	 int id;
	 //No Argument Constructor
	 public Student() {
			
	 }
	 //Parameterized Constructor
	 public Student(int id){
		this.id = id;
	 }
	 //Swap Method
	 public static void swapStudent(Student arr[]){
		 Student temp;
		 temp=arr[0];
		 arr[0]=arr[1];
		 arr[1]=temp;
	 }
}
