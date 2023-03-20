//Package Definition
package seed.agreegation;
//Class Definition Person
public class Person {
	
    //Instance Variable
        int id;
        String name;
        MyDate date;
    //No Argument Constructor
    public Person() {		
        id=1;
        name="Anupam";
        date=new MyDate();
    }
    public Person(int id, String name, MyDate date) {	
	    this.id = id;
	    this.name = name;
	    this.date = date;
    }
    //Print Method
    public void printPerson(){
	 System.out.println("ID:"+id+" "+"Name:"+name+" "+date.printMyDate());
    }
}