//Package Definition
package seed.agreegation;
//Driver Code
public class TestAgrr {
	
  public static void main(String[] args) {
	
	 //Object 1
	 Person p1=new Person();
	 //Print Person
	 p1.printPerson();
	 //Date Object
	 MyDate d1=new MyDate();
     //Object 2
	 Person p2=new Person(2,"Arjun",d1);
	 //Print Person
	 p2.printPerson();
	 MyDate d2=new MyDate(12,10,2023);
     //Object 3
	 Person p3=new Person(3,"Shikha",d2);
	 //Print Person
	 p3.printPerson();
	 //Object 4
	 Person p4=new Person();
	 //Print Person
	 p4.printPerson();
  }
}
