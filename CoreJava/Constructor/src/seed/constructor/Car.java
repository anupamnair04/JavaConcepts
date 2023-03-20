//Package Definition
package seed.constructor;
//Class Definition
public class Car {
	
	//Instance Variable
	String color;
	int price;
	static String brand;
	//Static Block
	static{
		System.out.println("Before Main Static Bloack");
		brand ="TATA";
	}
	//Constructor without parameter
	public Car(){

	}
	//Constructor with parameter
	public Car(String color, int price){
		this.color=color;
		this.price=price;
	}
	//Print Method
	public void printCar(){
		System.out.println(color+"\n"+Car.brand+"\n"+price);
	}
}
