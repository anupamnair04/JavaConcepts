//Package Definition
package seed.methodoverriding;
//Child Class Definition
public class Hdfc extends Sbi {
	
    @Override
	public float comm() {
		comm = 3.0f;
		return comm;
	}
}
