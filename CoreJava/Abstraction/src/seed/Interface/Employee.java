package seed.Interface;
//Sub Class Definition
public class Employee implements Printtable{
    int id;
    String name;
    int sal;
    
    public Employee() {
		super();
		id = 00;
		name = "yyyy";
		sal = 000;
	}
	public Employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	@Override
	public void print() {
		System.out.println("Employee Details"+" "+id+" "+name+" "+sal);
	}
}
