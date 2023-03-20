package seed.basicjava;
//Driver Code
public class TestEmployee {
	public static void main(String[] args) {

		Employee e1=new Employee();
		e1.initEmployee(02,"Shikha",23000.00f);
		e1.printEmployee();

		System.out.println("----------------");

		Employee e2=new Employee();
		e2.initEmployee(16,"Arjun",43000.00f);
		e2.printEmployee();
	}
}
