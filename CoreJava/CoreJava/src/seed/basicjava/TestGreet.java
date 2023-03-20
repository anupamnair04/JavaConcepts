package seed.basicjava;
//Driver Code
public class TestGreet {
	public static void main(String[] args) {	
		
		//Objects	 
		Greet g1=new Greet();
		Greet g2=new Greet();
		Greet g3=new Greet();
		
		//Call Method
		g1.greet(1);
		g1.greet("Good Morning");
		g2.greet(2);
		g2.greet("Good Afternoon");
		g3.greet(3);
		g3.greet("Good Night");
	}
}
