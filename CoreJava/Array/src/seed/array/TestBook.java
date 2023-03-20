//Package Definition
package seed.array;
//Importing Scanner Class
import java.util.Scanner;
//Driver Code
public class TestBook {
	
	public static void main(String[] args) {
		
		//Array
		Book barr[]=new Book[2];
		//No parameter Initialization	
		for(int i=0;i<barr.length;i++){
			barr[i]=new Book();
		}
		System.out.println("All Books");
		//Print Book
		for(int i=0;i<barr.length;i++){
			barr[i].printBook();
		}
		//Scanner Class For user input
		Scanner input=new Scanner(System.in);
		int id;
		String name;
		//User input for book & id
		System.out.println("Enter Id & Name");
		for(int i=0;i<barr.length;i++){
			id=input.nextInt();
			name=input.next();
			barr[i]=new Book(id,name);
		}
		//Print Book
		for(int i=0;i<barr.length;i++){
			barr[i].printBook();
		}
		input.close();
	}
}
