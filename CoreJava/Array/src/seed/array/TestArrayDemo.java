//Package Definition
package seed.array;
//Import Scanner Class
import java.util.Scanner;

//Driver Code
public class TestArrayDemo {
	public static void main(String[] args) {

		//Array
		int[]marks=new int[5];
		float[]sal=new float[5];
		String[]fruits={"Apple","Mango","Kiwi","Orange","Pappaya"};

		//Scanner Object 1 
		Scanner input = new Scanner(System.in);

		//User Input Marks
		System.out.println("Enter Array Marks");
		for(int i=0;i<marks.length;i++){
			marks[i]=input.nextInt();
		}

		//Print Marks
		System.out.println("Entered Marks");
		for(int i=0;i<marks.length;i++){
			System.out.println(marks[i]);
		}

		//User Input Salary
		System.out.println("Enter Array Salary");
		for(int i=0;i<sal.length;i++){
			sal[i]=input.nextFloat();
		}

		//Print Salary
		for(int i=0;i<sal.length;i++){
			System.out.println(sal[i]);
		}

		//User Input Fruits
		System.out.println("Enter Fruits");
		for(int i=0;i<fruits.length;i++){
			fruits[i]=input.next();
		}

		//Print Fruits
		for(int i=0;i<fruits.length;i++){
			System.out.println(fruits[i]);
		}

		//Enhanced for loop
		System.out.println("Fruits Available");
		for(String f:fruits){
			System.out.println(f);
		}

		//Closing Scanner Class
		input.close();
	}
}
