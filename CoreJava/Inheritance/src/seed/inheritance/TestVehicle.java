//Package Definition
package seed.inheritance;
//Driver Code
public class TestVehicle {
//Main Method
public static void main(String[] args) {
	
	   //Object Creation without parameter
	     Vehicle v1=new Vehicle();
	     v1.printVehicle();
	   //Object Creation without parameter
		 Bike b1=new Bike();
		 b1.printBike();
	   //Object Creation without parameter
		 Car c1=new Car();
		 c1.printCar();
		 
	   //Object Creation with parameter
	     Vehicle v2=new Vehicle(2,234456,"Pink"); 
		 v2.printVehicle();
	   //Object Creation with parameter
		 Bike b2=new Bike(11,250000,"White",2,"Electric"); 
		 b2.printBike();
	   //Object Creation with parameter
		 Car c2=new Car(11,250000,"White",2,"Electric");
		 c2.printCar();
	}
}
