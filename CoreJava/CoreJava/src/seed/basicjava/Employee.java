package seed.basicjava;
//Class Definition
public class Employee {

	int id;
	String name;
	float sal; 

	public void printEmployee(){
		System.out.println(id+"\n"+name+"\n"+sal);
	}
	public void initEmployee(int i,String n,float s){
		id=i;
		name=n;
		sal=s;
	}
}
