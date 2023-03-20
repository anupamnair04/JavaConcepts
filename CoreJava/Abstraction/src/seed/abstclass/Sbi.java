//Package Definition
package seed.abstclass;
//Sub Class Definition
public abstract class Sbi extends Bank {
	
	public abstract String greet();
	
	@Override
	public float getroi() {
		return 6.7f;
	}
	
	public String sendmsg (String msg){
		return msg+"was sending msg";
     }
}
