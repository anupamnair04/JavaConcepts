//Package Definition
package seed.array;
//Driver Code
public class TestPassByReference {
	
	public static void main(String[] args) {
	
		//Class Objects
		PassByReference e1=new PassByReference(10);
		PassByReference e2=new PassByReference(20);
		//Print Before Swapping
		System.out.println("Before Swapping");
		System.out.println("e1:"+e1.id+" "+"e2:"+e2.id);
		//Calling Swap Method
		PassByReference.swapEmployee(e1, e2);
		//Print After Swapping
		System.out.println("After Swapping");
		System.out.println("e1:"+e1.id+" "+"e2:"+e2.id);
	}
}
