//Package Definition
package seed.finall;
//Class Definition
public class Sample {
	
	public void displayCal(){
	try{
	    System.out.println("Open File");
	    System.out.println("Writing Data In File");
		int a = 10;
		//The value of the local variable res is not used
		@SuppressWarnings("unused")
		int res = a/0;
	} catch (ArithmeticException e){
		e.printStackTrace();
	} finally {
		System.out.println("Close File");
	}
	System.out.println("Rest of Code Application");
    }
}
