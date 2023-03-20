//Package Definition
package seed.scannerinput;
//Importing Scanner Class
import java.util.Scanner;
//Driver Code
public class IntegerInput {
	
	public static void main(String[] args) {
		
		//Scanner Object
		Scanner input = new Scanner(System.in);
		//User to store values
		System.out.println("Enter A:");
		int a = input.nextInt();
		System.out.println("Enter B:");
		int b = input.nextInt();
		System.out.println("Enter C:");
		int c = input.nextInt();
		//Calculating Sum of 3 Integers
		System.out.println("Sum:"+(a+b+c));

		System.out.println("Enter Name:");
		String name = input.next();

		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter Address:");
		String address  = input1.nextLine();
		System.out.println(name+" "+address);

		//Closing Scanner Class
		input.close();
		input1.close();
	}
}
