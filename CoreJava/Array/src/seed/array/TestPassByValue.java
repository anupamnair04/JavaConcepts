//Package Definition
package seed.array;
//Driver Code
public class TestPassByValue {
	
	public static void main(String[] args) {
	
		//Array
		PassByValue arr[]=new PassByValue[2];
		//Initialize Array
		arr[0]= new PassByValue(10);
		arr[1]= new PassByValue(20);
		//Print Before Swapping
		System.out.println("Before Swapping");
		System.out.println("arr[0]:"+arr[0].id+" "+"a[1]:"+arr[1].id);
		//Calling Swap Method
		PassByValue.swapEmployee(arr);
		//Print After Swapping
		System.out.println("After Swapping");
		System.out.println("arr[0]:"+arr[0].id+" "+"arr[1]:"+arr[1].id);
	}
}
