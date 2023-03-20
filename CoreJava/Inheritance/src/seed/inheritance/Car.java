//Package Definition
package seed.inheritance;
//Child Class Definition
public class Car extends Vehicle {
	
	//Instance Variables
	int wheel;
	String type;
	//No Argument Constructor
	 public Car(){
	 super();
	 wheel = 2;
	 type = "zzz";
	}
	//Constructor Method with parameters using this keyword
	public Car(int model,int price,String color,int wheel, String type){
	 super(model, price,color);
	 this.wheel=wheel;
	 this.type=type;
	}
	//Print Method
	public void printCar(){
	 printVehicle(); 
	 System.out.println(wheel+" "+type);
	}
}
