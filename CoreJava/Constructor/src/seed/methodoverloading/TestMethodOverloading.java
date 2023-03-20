//Package Definition
package seed.methodoverloading;
//Driver Code
public class TestMethodOverloading {
	
	public static void main(String[] args) {
		
		//Objects	 
		MethodOverloading m1=new MethodOverloading();
		//Call Method
		m1.add(10, 20);
		m1.add(10.0f, 20.0f);

		System.out.println(m1.add(10, 20.0f)); 
		System.out.println(m1.add(10.0f, 20));
	}
}
