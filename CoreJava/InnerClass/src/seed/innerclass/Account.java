//Package Definition
package seed.innerclass;
//Class Definition
public class Account {
	
	int key = 180390;

	private class Locker {
		@SuppressWarnings("unused")
		int lkey;

		public void validate (int lkey) {
			this.lkey = lkey;

			if (lkey == key) {
				System.out.println("Valid Key");
			}else {
				System.out.println("Invalid Key");
			}
		}
	}

	//Driver Code
	public static void main (String []args){

		Account a = new Account();
		Account.Locker a1 = a.new Locker();
		a1.validate(180390);
	}
}
