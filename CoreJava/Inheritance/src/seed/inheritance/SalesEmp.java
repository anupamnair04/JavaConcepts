//Package Definition
package seed.inheritance;
//Child Class Definition
public class SalesEmp extends WageEmp {
	
	//Instance Variables
	  int comm,sales;
    //No Argument Constructor
	public SalesEmp() {
		 super();
		 comm = 00000;
		 sales = 000000;
	}
	//Constructor Method with parameters using this keyword
	public SalesEmp(int id, int sal, String name,int bonus, int hours,double rate,int comm, int sales) {
		super(id, sal, name,bonus, hours,rate);
		this.comm=comm;
		this.sales=sales;
	}
	//Print Method
	public void printSalesEmp(){
	printWageEmp(); 
	System.out.println(comm+" "+sales);
	}
	public void CalSal(){
		System.out.println("SalesEmp"+" "+(sal+((hours*rate)+(sales*comm))));
	}
}
