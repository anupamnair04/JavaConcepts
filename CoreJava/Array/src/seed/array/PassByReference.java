//Package Definition
package seed.array;
//Class Definition
public class PassByReference {
	
	//Instance Variable
	int id;
	//No Argument Constructor
	public PassByReference() {

	}
	//Parameterized Constructor
	public PassByReference(int id) {
		this.id = id;
	}
	//Swap Method
	public static void swapEmployee(PassByReference e1, PassByReference e2){
		PassByReference temp=e1;
		e1=e2;
		e2=temp;
	}
}
