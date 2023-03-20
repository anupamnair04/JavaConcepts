//Package Definition
package seed.array;
//Driver Code
public class TestStudent {
 public static void main(String[] args) {
	
	//Array
	Student arr[]=new Student[2];
	//Initialize Array
	arr[0]= new Student(10);
	arr[1]= new Student(20);
	//Print Before Swapping
	System.out.println("Before Swapping");
	System.out.println("arr[0]:"+arr[0].id+" "+"a[1]:"+arr[1].id);
	//Calling Swap Method
	Student.swapStudent(arr);
	//Print After Swapping
	System.out.println("After Swapping");
	System.out.println("arr[0]:"+arr[0].id+" "+"arr[1]:"+arr[1].id);
	}
}
