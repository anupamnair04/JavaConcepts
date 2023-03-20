//Package Definition
package seed.innerclass;
//Driver Code
public class TestAnonymousClass {

	public static void main(String[] args) {
		
		Ferrari f = new Ferrari() {
			
			@Override
			public void run() {
				System.out.println("Ferrari");
			}
		};
        Driver d = new Driver() {
			
			@Override
			public void drive() {
				System.out.println("Driver");
			}
		};
		
		f.run();
		d.drive();
	}
}
