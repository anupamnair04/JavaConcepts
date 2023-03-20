//Package Definition
package seed.generics;
//Driver Code
public class TestGenericDemo {
	
	public static void main(String[] args) {
		
		GenericDemo<String> g = new GenericDemo<String>("Anupam");
		String s = g.getObject();
		System.out.println(s);
		
		GenericDemo<Integer> i = new GenericDemo<Integer>(1);
		Integer n = i.getObject();
		System.out.println(n);
		
		GenericDemo<Float> f = new GenericDemo<Float>(10.0f);
		Float p = f.getObject();
		System.out.println(p);
	}
}
