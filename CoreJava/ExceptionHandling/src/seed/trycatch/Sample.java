//Package Definition
package seed.trycatch;
//Class Definition
public class Sample {
	
	public void displayCal(){
		try{
			int a = 10;
			//The value of the local variable div is not used
			@SuppressWarnings("unused")
			int div = a/0;
			int arr[] = new int[5];
			arr[5] = 20;
			System.out.println(arr[5]);
		} catch (ArithmeticException e){
			e.printStackTrace();
		}
		System.out.println("Rest of Code Application");
	}
}
