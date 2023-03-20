//Package Definition
package seed.collection;
//Import Scanner Class
import java.util.Scanner;
//Import Vector Class
import java.util.Vector;
//Driver Code
public class VectorDemo {
	
	public static void main (String []args){

		Vector<String> colors = new Vector<String>();
		//User Input
		System.out.println("Enter 3 color name");
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<3;i++){
			colors.add(sc.next());
		}
		//Enhanced for loop to print color
		System.out.println("All colors Are:");
		for(String s:colors){
			System.out.println(s);
		}
		//Remove Color
		colors.remove("Red");
		System.out.println("After removing color");
		for(String s:colors){
			System.out.println(s);
		}
		//Set Color
		colors.set(1,"Pink");
		System.out.println("After set operations");
		for(String s:colors){
			System.out.println(s);
		}

		Vector<Integer> num = new Vector<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);

		System.out.println("Capacity:"+" "+num.capacity());
		System.out.println("Array:"+" "+num);

		num.add(40);
		System.out.println("Capacity:"+" "+num.capacity());
		System.out.println("Array:"+" "+num);

		//Scanner close
		sc.close();
	}
}
