//Package Definition
package seed.scannerinput;
//Importing Scanner Class
import java.util.Scanner;
//Driver Code
public class DisplayPerson {
	
	public static void main(String[] args) {
		
		//Scanner Object 1
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ID:");
		int id = input.nextInt();
		System.out.println("Enter Name:");
		String name = input.next();
		System.out.println("Enter City:");
		String city = input.next();

		//Scanner Object 2
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter Street:");
		String street = input1.nextLine();
		System.out.println("Enter Country:");
		String country = input1.next();

		//Final Output Print
		System.out.println(id+" "+name+" "+city+" "+street+" "+country);

		//Closing Scanner Class
		input.close();
		input1.close();
	}
}
