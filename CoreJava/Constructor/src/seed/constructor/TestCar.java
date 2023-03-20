//Package Definition
package seed.constructor;
//Driver Code
public class TestCar {
	
	public static void main(String[] args) {
		
		System.out.println("After Static Block Main Method");

		//Create Object Car 1  
		Car c1=new Car("Blue",4500000);
		//Calling Print Method
		c1.printCar();
	}
}
