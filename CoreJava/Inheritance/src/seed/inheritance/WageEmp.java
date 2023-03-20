//Package Definition
package seed.inheritance;
//Child Class Definition
public class WageEmp extends Manager{
	
	//Instance Variables
	  int hours;
	  double rate;
	//No Argument Constructor
	public WageEmp(){
		   super();
		   hours = 0000;
		   rate=00.0;
	}
	//Constructor Method with parameters using this keyword
	public WageEmp(int id,int sal,String name,int bonus,int hours,double rate){
		   super(id,sal,name,bonus);
		   this.hours=hours;
		   this.rate=rate;
	}
	//Print Method
	public void printWageEmp(){
		   printEmployee(); 
		   System.out.println(hours+" "+rate);
	}
	public void CalSal(){
		System.out.println("WageEmp"+" "+(sal+(hours*rate)));
	}
}