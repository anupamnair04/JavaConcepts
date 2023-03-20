//Package Definition
package seed.upcastingdowncasting;
//Driver Code
public class TestVehicle {
	
	public static void printAllVehicleInfo(Vehicle v){
		
		v.VehicleInfo();
		if (v instanceof Car){
			v.run();
			
			Car c = (Car)v;
			c.CarInfo();
		}
		else if (v instanceof Bike){
            v.run();
			
			Bike b = (Bike)v;
			b.BikeInfo();
		}
	}
	public static void main(String[] args) {
		
		Vehicle v1 = new Car();
		v1.run();
		
		Vehicle v2 = new Bike();
		v2.run();
		
		Vehicle v3 = new Vehicle();
		v3.run();

		Bike b2 = (Bike)v2;
		b2.BikeInfo();
		
		System.out.println("----------------------");
		
		TestVehicle.printAllVehicleInfo(v2);
	}
}
