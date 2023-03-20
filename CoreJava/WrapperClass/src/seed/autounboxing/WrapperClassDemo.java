//Package Definition
package seed.autounboxing;
//Driver Code
public class WrapperClassDemo {
	
	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(a);
		Integer i = new Integer(20);
		System.out.println(i);
		
	    //Autoboxing
		Integer obj = a;
		System.out.println("Integer Object"+" "+obj);
		
		//Unboxing
		int b = obj;
		System.out.println("Primitive int b"+" "+b);

		Float f = 23.0f;
		System.out.println(f);
		
		//Explicitly Converting Wrapper Class To Primitive Data Type
		float f1 = f.floatValue();
		System.out.println(f1);
		
		//Explicitly Converting Primitive Data Type To Wrapper Class
		float b1 = Float.valueOf(f1);
		System.out.println(b1);
	}
}
