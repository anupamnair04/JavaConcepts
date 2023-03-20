//Package Definition
package seed.constructor;
//Driver Code
public class TestAccount {
	
	public static void main(String[] args) {
		
		//Object Creation without parameter
		Account a1=new Account();
		//Print Object
		a1.printAccount();

		//Object Initialization with parameter
		Account a2=new Account(190390,"Mr. Suresh Desai",230987);
		//Print Object
		a2.printAccount();

		//Object Initialization with parameter
		Account a3=new Account(25004,"Mr. Dharam Vohra",464475);
		//Print Object
		a3.printAccount();
	}
}
