//Package Definition
package seed.innerclass;
//Driver Code
public class TestStaticInnerClass {
	
	public static void main(String[] args) {
		
		StaticInnerClass.Inner obj = new StaticInnerClass.Inner();
		obj.msg();
		
		StaticInnerClass.Inner.show();
	}
}
