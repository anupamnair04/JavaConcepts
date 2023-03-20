//Package Definition
package seed.constructor;
//Import Scanner Class
import java.util.Scanner;
//Driver Code
public class TestCustomer {
	
	public static void main(String[] args) {

		//Scanner Object 1 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ID:");
		int id = input.nextInt();
		System.out.println("Enter Name:");
		String name = input.next();

		//Scanner Object 2
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter Address:");
		String address = input1.nextLine();

		//Constructor Object 1
		Customer c1= new Customer(id, name, address);
		c1.printCustomer();

		input.close();
		input1.close();
	}
}
