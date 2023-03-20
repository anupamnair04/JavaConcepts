//Package Definition
package seed.abstclass;
//Driver Code
public class TestShape {
	
	public static void main(String[] args) {
		Shape s;
		
		s = new Circle();
		System.out.println(s.getshape());
		System.out.println(s.colour());
		System.out.println(s.CalArea());
		
		System.out.println("---------------");
		
		s = new Rectangle();
		System.out.println(s.getshape());
		System.out.println(s.colour());
		System.out.println(s.CalArea());
	}
}
