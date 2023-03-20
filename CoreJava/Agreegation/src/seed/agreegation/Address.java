//Package Definition
package seed.agreegation;
//Class Definition Address
public class Address {
	
	//Instance Variable
	int bdate; 
	String address;
	//No Argument Constructor
	public Address() {	
		bdate=18;
		address="Palanpur, Gujarat";
	}
	public Address(int bdate, String address) {	
		this.bdate = bdate;
		this.address = address;
	}
	//Print Address
	public String printAddress(){
		return bdate+"/"+address;
	}
}
