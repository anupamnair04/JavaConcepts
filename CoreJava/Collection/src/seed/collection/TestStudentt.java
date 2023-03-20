//Package Definition
package seed.collection;
//Import ArrayList
import java.util.ArrayList;
//Import Collections Class
import java.util.Collections;
//Driver Code
public class TestStudentt {
	
	public static void main(String[] args) {

		ArrayList<Studentt> s = new ArrayList<Studentt>();
		s.add(new Studentt(1,"A"));
		s.add(new Studentt(2,"An"));
		s.add(new Studentt(3,"Anu"));
		s.add(new Studentt(4,"Anup"));
		s.add(new Studentt(5,"Anupam"));
		System.out.println(s);

		System.out.println("Before Sorting");
		for(Studentt st:s){
			System.out.println(st);
		}
		Collections.sort(s);

		System.out.println("After Sorting");
		for(Studentt st:s){
			System.out.println(st);
		}
	}
}
