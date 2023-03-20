//Package Definition
package seed.regexp;
//Import Java Regular Expression Package
import java.util.regex.*;
//Class Definition
public class RegExp4 {

	public static void main(String[] args) {
		
		Pattern pat = Pattern.compile("[a-z]+");
		Matcher mat = pat.matcher("this is a test.");
				
		while(mat.find())
			System.out.println("Match:"+ mat.group());

	}
}
