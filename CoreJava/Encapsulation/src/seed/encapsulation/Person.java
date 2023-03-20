//Package Definition
package seed.encapsulation;
//Class Definition
public class Person {
	
	//Access Modifier with Instance Variable
	private int id;
	private String name;
	private int age;
	//Getter And Setter Methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public boolean setAge(int age) {
		if (age >=0 && age <=100){
			this.age = age;
			return true;
		}else{
			return false;
		}
	}
	//Print Objects
	public void printPerson(){
		System.out.println(getId()+" "+getName()+" "+getAge());
	}
}
