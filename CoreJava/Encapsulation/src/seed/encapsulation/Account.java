//Package Definition
package seed.encapsulation;
//Class Definition
public class Account {
	
	//Access Modifier with Instance Variable
	private int acc_num;
	private String acc_name;
	private double bal;
	private int pin=180390;
	//Getter And Setter Methods
	public int getAcc_num() {
		return acc_num;
	}
	public void setAcc_num(int acc_num) {
		this.acc_num = acc_num;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	public double isBal(int pin) {
		if(this.pin==pin)
			return bal;
		else
			return 0;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	//Print Objects
	public void printAccount(){
		System.out.println(getAcc_num()+" "+getAcc_name()+" "+bal);
	}
}
