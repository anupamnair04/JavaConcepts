//Package Definition
package seed.covariantreturndatatype;
//Driver Code
public class TestParentChild {
	
	public static void main(String[]args){
		
		new Child().show().childInfo();
		new Child().show().parentInfo();
		new Parent().show().parentInfo();
	}
}
