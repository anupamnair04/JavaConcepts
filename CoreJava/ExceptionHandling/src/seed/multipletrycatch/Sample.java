//Package Definition
package seed.multipletrycatch;
//Class Definition
public class Sample {
	
	public void displayCal(){
		try{
			int a = 10;
			//The value of the local variable div is not used
			@SuppressWarnings("unused")
			int div = a/0;
			int arr[] = new int[5];
			arr[4] = 10;
			System.out.println(arr[5]);
		} catch (ArithmeticException e){
			e.printStackTrace();
			System.out.println("Please Do Not Divide It By Zero");
		} catch (ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}
		System.out.println("Rest of Code Application");
	}
}
