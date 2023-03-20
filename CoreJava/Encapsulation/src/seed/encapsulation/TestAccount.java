//Package Definition
package seed.encapsulation;
//Driver Code
public class TestAccount {
	
	public static void main(String[] args) {
		
		//Create Object
		Account a1=new Account();
		//Set Value
		a1.setAcc_num(180390);
		a1.setAcc_name("Swara");
		a1.setBal(5000.00);
		//Get Value
		a1.getAcc_num();
		a1.getAcc_name();
		a1.isBal(180390);
		//Call Print
		a1.printAccount();
	}
}
