//Package Definition
package seed.innerclass;
//Anonymous Class Car Definition
public class Car {
	
	Ferrari f = new Ferrari() {
		@Override
		public void run() {
			System.out.println("Ferrari is Running");
		}
	};
	Driver d = new Driver() {
		@Override
		public void drive() {
			System.out.println("Driver Drives Ferrari");
		}
	};
}
