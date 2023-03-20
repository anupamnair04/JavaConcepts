//Package Definition
package seed.inheritance;
//Child Class Definition
public class Bike extends Vehicle {
	
	//Instance Variables
	int wheel;
	String type;
	//No Argument Constructor
	public Bike(){
	 super();
	 wheel = 1;
	 type = "yyy";
	}
	//Constructor Method with parameters using this keyword
	public Bike(int model,int price,String color,int wheel, String type){
	 super(model, price,color);
	 this.wheel=wheel;
	 this.type=type;
	}
	//Print Method
	public void printBike(){
	 printVehicle(); 
	 System.out.println(wheel+" "+type);
	}
}