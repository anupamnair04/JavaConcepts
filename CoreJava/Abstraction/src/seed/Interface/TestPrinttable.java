package seed.Interface;
//Driver Code
public class TestPrinttable {
	public static void main(String[] args) {
		
		Printtable p;
		p = new Student();
		p.print();
		
		p = new Employee();
		p.print();
        
		System.out.println(Printtable.b);
		
		MoveEat m;
		m = new Animal();
		m.eat();
		
		m = new Person();
		m.eat();
	}
}
