//Package Definition
package seed.collection;
//Class Definition
public class Studentt implements Comparable<Studentt> {
	
	//Instance Variable
	int roll;
	String name;
	//No Arg Constructor
	public Studentt(){
		roll = 0;
		name ="xxx";
	}
	//Parameterized Constructor
	public Studentt(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	//Print Method
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Studentt o) {
		/*if(this.id>o.id)
		  return 1;
		  else if (this.id<o.id)
		  return -1;
		 */
		return this.name.compareTo(o.name);
	}
}
