//Package Definition
package seed.abstclass;
//Sub Class Definition
public class Rectangle extends Shape {
	
	@Override
	public String getshape() {
		return "Shape is Lines";
	}
	@Override
	public String colour() {
		return "Colour is Blue";
	}
	@Override
	public int CalArea() {
		return 4*4;
	}
}
