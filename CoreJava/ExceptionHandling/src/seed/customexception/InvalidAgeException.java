//Package Definition
package seed.customexception;
//Class Definition
public class InvalidAgeException extends Exception {
	
	/*The serializable class InvalidAgeException does not declare a 
	  static final serialVersionUID field of type long*/
	private static final long serialVersionUID = 1L;

	public InvalidAgeException (String msg) {
		super (msg);
	}
}
