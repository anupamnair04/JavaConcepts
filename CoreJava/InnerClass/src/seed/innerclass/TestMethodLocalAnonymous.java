//Package Definition
package seed.innerclass;
//Driver Code
public class TestMethodLocalAnonymous {
	
	public static void main(String[] args) {
		
		Shape s = new Shape() {
			
			@Override
			public void draw() {
				System.out.println("Circle");
			}
		};
        s.draw();
	}
}
