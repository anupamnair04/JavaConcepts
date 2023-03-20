//Package Definition
package seed.methodoverriding;
//Child Class Definition
public class WageEmp extends Employee {
	
	int hours=3;
	float rate=2.0f;
	    @Override
	    public int CalSal() {
			return (int) (hours * rate);
		}
}
