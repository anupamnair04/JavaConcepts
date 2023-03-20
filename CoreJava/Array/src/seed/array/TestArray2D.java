//Package Definition
package seed.array;
//Scanner Class
import java.util.Scanner;

//Driver Code
public class TestArray2D {
	
	public static void main(String[] args) {

		//Variable
		int[][]matrix=new int[100][100];

		//Scanner Object 1 
		Scanner input = new Scanner(System.in);

		//User Input For Rows & Columns
		System.out.println("Enter Rows & Columns");
		int row=input.nextInt();
		int col=input.nextInt();

		//User Input Matrix
		System.out.println("Enter Matrix Elements");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				matrix[i][j]=input.nextInt(); 
			}
		}

		//Constructor Object 1
		Array2D a1=new Array2D(row, col,matrix );

		//Print Matrix Method
		a1.printMatrix();

		/*Print Matrix
        System.out.println("Matrix");
        for(int i=0;i<row;i++){
         for(int j=0;j<col;j++){
    	  System.out.println(matrix[i][j]);
         }
        }*/

		//Print first element of matrix
		System.out.println("First Element"+" "+matrix[0][0]);

		//Closing Scanner Class
		input.close();
	}
}
