//Package Definition
package seed.methodoverriding;
//Child Class Definition
public class Manager extends Employee {
	
	int bonus=3000;
		@Override
		public int CalSal() {
			return Sal + bonus;
		}
}
