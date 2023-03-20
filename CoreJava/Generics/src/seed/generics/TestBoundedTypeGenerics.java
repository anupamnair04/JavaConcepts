//Package Definition
package seed.generics;
//Driver Code
public class TestBoundedTypeGenerics {
	
	public static void main(String[] args) {
		
	BoundedTypeGenerics<Integer> c = new BoundedTypeGenerics<Integer>(10);
	Integer i = c.getNumber();
	System.out.println(i);
	
	BoundedTypeGenerics<Double> c1 = new BoundedTypeGenerics<Double>(12.5);	
	Double d = c1.getNumber();
	System.out.println(d);
	
	BoundedTypeGenerics<Float> c2 = new BoundedTypeGenerics<Float>(34.0f);	
	Float f = c2.getNumber();
	System.out.println(f);
	
	}
}
