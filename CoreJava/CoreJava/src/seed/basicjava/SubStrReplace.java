package seed.basicjava;
//Import Scanner Class
import java.util.Scanner;
//Super Class Definition
public class SubStrReplace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Enter the string to be replaced: ");
		String old_str = sc.nextLine();
		System.out.println("Enter the new string: ");
		String new_str = sc.nextLine();
		String replaced = str.replace(old_str, new_str);
		System.out.println("replaced string: " + replaced);
		
		sc.close();
	}
}
