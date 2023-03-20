//Package Definition
package seed.inheritance;
//Parent Class Definition
public class Vehicle {
	
	//Instance Variables
		int model,price;
		String color;
	//No Argument Constructor
	public Vehicle(){
		    super();
			model=0;
			price=00000;
			color = "xxx";
	}
	//Constructor Method with parameters using this keyword
	public Vehicle(int model,int price,String color){
			super();
		    this.model=model;
		    this.price=price;
			this.color=color;	
	}
	//Print Method
	public void printVehicle(){
	 System.out.println("Vehicle Details"+" "+model+" "+price+" "+color);
	}
}
