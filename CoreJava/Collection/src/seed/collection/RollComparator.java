//Package Definition
package seed.collection;
//Import Comparator Class
import java.util.Comparator;
//Class Definition
public class RollComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.roll>o2.roll){
			return 1;
		} else if(o1.roll<o2.roll){
			return -1;
		} else {
			return 0;
		}
	}
}
