//Package Definition
package seed.regexp;
//Import Java Regular Expression Package
import java.util.regex.*;
//Class Definition
public class RegExp3 {

	public static void main(String[] args) {
		
		Pattern pat = Pattern.compile("e.+?d");
		Matcher mat = pat.matcher("extend cup and table");
				
		while(mat.find())
			System.out.println("Match:"+ mat.group());

	}
}
