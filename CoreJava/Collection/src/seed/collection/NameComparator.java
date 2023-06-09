//Package Definition
package seed.collection;
//Import Comparator Class
import java.util.Comparator;
//Class Definition
public class NameComparator implements Comparator <Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}
