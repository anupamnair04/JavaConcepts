//Package Definition
package seed.methodoverriding;
//Child Class Definition
public class SalesEmp extends WageEmp {
	
	int sales=50;
	float comm=6.0f;
	    @Override
		public int CalSal() {
			return (int) ((sales * comm) + (hours * rate));
		}
}
