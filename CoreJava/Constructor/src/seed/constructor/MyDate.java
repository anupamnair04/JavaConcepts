//Package Definition
package seed.constructor;
//Class Definition
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
	public MyDate(int date){
		this();//11-9-2022
		this.date=date;//24-9-2022
	}
	//Constructor with two parameter
	public MyDate(int date,int year){// 24-2022
		this(date);//24
		this.year=year;//24-2023
	}
	//Constructor with three parameter
	public MyDate(int date,int month,int year){//24-9-2023
		this(date,year);//24-2023
		this.month=month;//10
	}
	//Print MyDate
	public void printMyDate(){
		System.out.println(date+"/"+month+"/"+year);
	}
	//Print Date
	public void printDate(){
		System.out.println(date+"/"+month+"/"+year);
	}
	//Print Year
	public void printDateYear(){
		System.out.println(date+"/"+year);
	}
	//Print Month
	public void printMonthYear(){
		System.out.println(month+"/"+year);
	}	 
}
