package seed.basicjava;
//Class Definition
public class Student {
	//Instance variables
	int id;
	String name;
	float marks;
	//Static Variable
	static String clgName="SEED INFOTECH"; 
	//Print Method
	public void printStudent(){
		System.out.println(id+"\n"+name+"\n"+marks+"\n"+Student.clgName);
	}
	//Instance Methods to store object once
	public void instStudent(int i,String n,float m){
		id=i;
		name=n;
		marks=m;
	}
}

