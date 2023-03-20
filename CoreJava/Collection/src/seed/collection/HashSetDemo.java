//Package Definition
package seed.collection;
//Import HashSet Class
import java.util.HashSet;
import java.util.Iterator;
//Import Scanner Class
import java.util.Scanner;
//Driver Code
public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> color = new HashSet<String>();
		//User Input
		System.out.println("Enter 3 colors");
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<3;i++){
			color.add(sc.next());
		}
		//Enhanced for loop to print number
		System.out.println("All Colors Are:");
		for(String c:color){
			System.out.println(c);
		}
		//Remove Color
		color.remove("Red");
		System.out.println("After removing color");
		for(String s:color){
			System.out.println(s);
		}
		Iterator<String> it = color.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println(color.size());
		color.clear();
		System.out.println("HashSet After Clear Operation");
		System.out.println(color);
		//Scanner Close
		sc.close();
	}
}
