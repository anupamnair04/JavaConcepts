//Package Definition
package seed.customexception;
//Driver Code
public class TestCustomException {
	
	public static void main(String[] args) {
		
		Voting v = new Voting();
		try {
			v.CheckAge(17);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		
     System.out.println("Rest Of Code");
	}
}
