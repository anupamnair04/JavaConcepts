//Package Definition
package seed.customexception;
//Class Definition
public class Voting {
	
    public void CheckAge(int age) throws InvalidAgeException{
    	if (age < 18){
    		throw new InvalidAgeException("Invalid Age");
    	} else{
    		System.out.println("Valid Age");
    	}
    }
}
