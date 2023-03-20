//Package Definition
package seed.array;
//Class Definition
public class PassByValue {
	
	//Instance Variable
	int id;
	//No Argument Constructor
	public PassByValue() {

	}
	//Parameterized Constructor
	public PassByValue(int id){
		this.id = id;
	}
	//Swap Method
	public static void swapEmployee(PassByValue arr[]){
		PassByValue temp;
		temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
	}
}
