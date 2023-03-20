//Package Definition
package seed.regexp;
//Import Java Regular Expression Package
import java.util.regex.*;
//Class Definition
public class RegExp5 {

	public static void main(String[] args) {
		
		String str = "Jon Drinks Water Jon Know oddno";
		
		Pattern pat = Pattern.compile("Jon.*? ");
		Matcher mat = pat.matcher(str);
		
		System.out.println("Original Sequence:"+str);
		
		str = mat.replaceAll("Ram ");
		System.out.println("Modified Sequence:"+str);
				
	}
}
