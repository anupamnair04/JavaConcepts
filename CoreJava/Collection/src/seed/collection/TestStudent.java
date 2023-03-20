//Package Definition
package seed.collection;
//Import Array List
import java.util.ArrayList;
//Import Iterator Class
import java.util.Iterator;
//Import Scanner Class
import java.util.Scanner;
//Driver Code
public class TestStudent {
	
	public static void main(String[] args) {

		ArrayList<Student> s = new ArrayList<Student>();
		s.add(new Student(1,"Anu"));
		System.out.println(s);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Details:");
		for(int i=0;i<2;i++){
			s.add(new Student(sc.nextInt(),sc.next()));
		}
		//Close Scanner Class
		sc.close();

		//Iterator Interface
		System.out.println("All elements of Array List");
		Iterator<Student> it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}