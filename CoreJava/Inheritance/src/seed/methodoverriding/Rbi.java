//Package Definition
package seed.methodoverriding;
//Child Class Definition
public class Rbi extends Hdfc {
	
  @Override
  public float comm() {
		comm = 4.0f;
		return comm;
	}
}
