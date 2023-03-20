//Package Definition
package seed.methodoverriding;
//Driver Code
public class TestEmployee {
	
		public static void main(String[] args) {
			
			Employee e1 = new Employee();
			System.out.println(e1.CalSal());
			
			Manager m1 = new Manager();
			System.out.println(m1.CalSal());
			
			WageEmp w1 = new WageEmp();
			System.out.println(w1.CalSal());
			
			SalesEmp s1 = new SalesEmp();
			System.out.println(s1.CalSal());
		}
}
