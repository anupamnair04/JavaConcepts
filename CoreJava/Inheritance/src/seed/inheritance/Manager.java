//Package Definition
package seed.inheritance;
//Child Class Definition
public class Manager extends Employee {
	
	//Instance Variables
	  int bonus;
	//No Argument Constructor
	  public Manager(){
			 super();
			 bonus = 000;
	  }
	//Constructor Method with parameters using this keyword
	  public Manager(int id,int sal,String name,int bonus){
			 super(id,sal,name);
			 this.bonus=bonus;	
	  }
	//Print Method
	  public void printManager(){
		     printEmployee(); 
	         System.out.println(bonus);
		}
	  public void CalSal(){
		  System.out.println("SalaryBonus"+" "+(sal+bonus));
	  }
}
