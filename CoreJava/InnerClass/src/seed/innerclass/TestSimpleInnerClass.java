//Package Definition
package seed.innerclass;
//Driver Code
public class TestSimpleInnerClass {
	
	public static void main(String[] args) {
		
		SimpleInner s = new SimpleInner();
		SimpleInner.Inner i = s.new Inner();
		i.show();
	}
}
