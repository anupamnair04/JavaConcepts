//Package Definition
package seed.methodoverriding;
//Driver Code
public class TestBank {

	public static void main(String[] args) {
		
		Hdfc h1 = new Hdfc();
		System.out.println(h1.comm());
		
		Sbi s1 = new Sbi();
		System.out.println(s1.comm());
		
		Rbi r1 = new Rbi();
		System.out.println(r1.comm());
	}
}
