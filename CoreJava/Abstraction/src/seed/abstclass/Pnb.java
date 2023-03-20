//Package Definition
package seed.abstclass;
//Sub Class Definition
public class Pnb extends Sbi{

	@Override
	public float getroi() {
		return 2.2f;
	}

	@Override
	public String greet() {
		return "Good Morning";
	}

	public String sendmsg (String msg){
		return msg+"has sent msg";
     }
}
