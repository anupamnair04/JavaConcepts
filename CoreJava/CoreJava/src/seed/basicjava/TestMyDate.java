package seed.basicjava;
//Driver Code
public class TestMyDate {
	public static void main(String[] args) {

		MyDate d1=new MyDate();
		d1.initMyDate(18,9,2000);
		d1.printMyDate();

		System.out.println("----------------");

		MyDate d2=new MyDate();
		d2.initMyDate(22,12,1999);
		d2.printMyDate();
	}
}
