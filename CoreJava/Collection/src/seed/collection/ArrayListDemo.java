//Package Definition
package seed.collection;
//Import ArrayList
import java.util.ArrayList;
//Import Iterator 
import java.util.Iterator;
//Import Scanner
import java.util.Scanner;

//Driver Code
public class ArrayListDemo {
	
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);

		System.out.println(al);

		//ArrayList Scanner Input
		ArrayList<String> names = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Names:");
		for(int i=0;i<5;i++){
			names.add(sc.next());
		}
		System.out.println(names);

		//Iterator Interface
		System.out.println("All elements of Array List");
		Iterator<String> it = names.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		//Using Enhanced For Loop
		for(Integer i:al){
			System.out.println(i);
		}

		//Remove Element  
		al.remove(0);
		System.out.println("Remove Element");

		//Set Element
		al.set(0, 10);
		System.out.println(al);

		sc.close();
	}
}
