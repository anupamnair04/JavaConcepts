//Package Definition
package seed.abstclass;
//Abstract Class Definition
public abstract class Bank {
	
    float roi;
    //Abstract Method
    public abstract float getroi();
     
    public String sendmsg (String msg){
		return msg+"is sending msg";
    }
}
