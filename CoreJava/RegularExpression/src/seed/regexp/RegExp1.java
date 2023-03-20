//Package Definition
package seed.regexp;
//Import Java Regular Expression Package
import java.util.regex.*;
//Class Definition
public class RegExp1 {

	public static void main(String[] args) {
				
		Pattern pat = Pattern.compile("W+");
		Matcher mat = pat.matcher("W WW WWW");
				
		while(mat.find())
			System.out.println("Match:"+ mat.group());
	}
}
