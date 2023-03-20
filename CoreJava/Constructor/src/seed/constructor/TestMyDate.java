//Package Definition
package seed.constructor;
//Driver Code
public class TestMyDate {
	
	public static void main(String[] args) {
		
		//Object Creation without parameter
		MyDate d1=new MyDate();
		//Print Object
		d1.printMyDate();

		//Object Initialization with parameter
		MyDate d2=new MyDate(24);
		//Print Object
		d2.printDate();

		MyDate d3=new MyDate(22,1999);
		//Print Object
		d3.printDateYear();

		MyDate d4=new MyDate(12,1999);
		//Print Object
		d4.printMonthYear();
	}
}
