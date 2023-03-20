//Package Definition
package seed.collection;
//Import ArrayList Class
import java.util.ArrayList;
//Import Collections Class
import java.util.Collections;
//Import Comparator Class
import java.util.Comparator;
//Driver Code
public class CollectionSort {
	
	public static void main(String[] args) {

		ArrayList <Integer> a = new ArrayList<Integer>();	
		a.add(10);
		a.add(50);
		a.add(30);
		a.add(20);
		a.add(1);
		System.out.println("Array List Before Sorting:"+" "+a);

		Collections.sort(a);
		System.out.println("Array List After Sorting:"+" "+a);

		Comparator <Integer> c = Collections.reverseOrder();
		Collections.sort(a,c);
		System.out.println("Reverse Array List:"+" "+a);
	}
}
