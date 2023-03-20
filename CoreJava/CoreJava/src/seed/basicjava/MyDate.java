package seed.basicjava;
//Class Definition
public class MyDate {

	int date,month,year;

	public void printMyDate(){
		System.out.println(date+"/"+month+"/"+year);
	}
	public void initMyDate(int d,int m,int y){
		date=d;
		month=m;
		year=y;
	}
}
