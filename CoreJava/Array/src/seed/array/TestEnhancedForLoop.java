//Package Definition
package seed.array;
//Importing Scanner Class
import java.util.Scanner;

//Driver Code
public class TestEnhancedForLoop {
	
	public static void main(String[] args) {

		//Variable
		int row,col;

		//Array 
		String color[][]=new String [50][50] ;

		//Scanner Object
		Scanner input = new Scanner(System.in);

		//User Input For Rows & Columns
		System.out.println("Enter Rows");
		row = input.nextInt();
		System.out.println("Enter Columns");
		col = input.nextInt();

		//User input For String Elements
		System.out.println("Enter Colors");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				color[i][j] = input.next();
			}
		}

		//Print Color
		System.out.println("Colors");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println(color[i][j]);
			}
		}

		//Enhanced For Loop
		for(String[] c:color)
		{
			for(String c1:c)
			{
				System.out.println(c1);
			}
		}

		//Closing Scanner Class
		input.close();
	}
}
