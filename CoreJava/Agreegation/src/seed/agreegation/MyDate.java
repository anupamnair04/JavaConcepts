//Package Definition
package seed.agreegation;
//Class Definition MyDate
public class MyDate {
	
	//Instance Variable
	int date,year,month;
	//Constructor without parameter
	public MyDate(){
      date=11;
	  month=9;
	  year=2022;
    }
	//Constructor without parameter
	public MyDate(int date,int month, int year){
	  this.date=date;
	  this.month=month;
	  this.year=year;
	}
	//Print MyDate
	public String printMyDate(){
		return date+"/"+month+"/"+year;
	}
}