//Package Definition
package seed.covariantreturndatatype;
//Child Class Definition
public class Child extends Parent{
	
	@Override
	public Child show() {
		return this;
	}
	public void childInfo(){
		System.out.println("This is Child");
	}
}
