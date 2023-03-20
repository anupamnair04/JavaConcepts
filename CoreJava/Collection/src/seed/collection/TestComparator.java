//Package Definition
package seed.collection;
//Import Java ArrayList
import java.util.ArrayList;
import java.util.Collections;
//Driver Code
public class TestComparator {

	public static void main(String[] args) {
		
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(new Student(1, "Anu"));
		s.add(new Student(11, "Anup"));
		s.add(new Student(111, "Anupam"));
		System.out.println(s);
		
		Collections.sort(s,new NameComparator());
		System.out.println("Sorting Based on Names");
		for(Student st:s){
			System.out.println(st);
		}
		
		ArrayList<Product> p = new ArrayList<Product>();
		p.add(new Product(1, "TATA",100.00));
		p.add(new Product(2, "BIRLA",3000.00));
		p.add(new Product(3, "SEED",2000.00));
		System.out.println(p);
		
		Collections.sort(p,new PriceComparator());
		System.out.println("Sorting Based on Price");
		for(Product pt:p){
			System.out.println(pt);
		}
	}
}
