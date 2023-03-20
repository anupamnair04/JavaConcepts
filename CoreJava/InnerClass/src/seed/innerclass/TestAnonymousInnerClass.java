//Package Definition
package seed.innerclass;
/*Abstract Class Definition Ferrari
abstract class Ferrari{
	public abstract void run();
}
//Interface Class Driver Definition
interface Driver{
	public void drive();
}
//Anonymous Class Car Definition
class Car{
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
}*/
//Driver Code
public class TestAnonymousInnerClass {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.f.run();
		c.d.drive();
	}
}
