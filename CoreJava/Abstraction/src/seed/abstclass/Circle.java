//Package Definition
package seed.abstclass;
//Abstract Sub Class Definition
public class Circle extends Shape {
	
	@Override
	public String getshape() {
		return "Shape is Round";
	}
	@Override
	public String colour() {
		return "Color is Red";
	}
	@Override
	public int CalArea() {
		return (int) (2*3.14*4);
	}
}
