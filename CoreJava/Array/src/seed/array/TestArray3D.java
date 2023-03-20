//Package Definition
package seed.array;
//Importing Scanner Class
import java.util.Scanner;
//Driver Code
public class TestArray3D {
	public static void main(String[] args) {

		//Scanner Object
		Scanner input = new Scanner(System.in);

		//User Input For n1,n2 & n3
		System.out.println("Enter Values For n1,n2 & n3");
		int n1=input.nextInt();
		int n2=input.nextInt();
		int n3=input.nextInt();

		//Array
		int matrix[][][]=new int[n1][n2][n3];

		//User Input For Matrix Elements
		System.out.println("Enter Matrix Elements");
		for(int i=0;i<n1;i++){
			for(int j=0;j<n2;j++){
				for(int k=0;k<n3;k++){
					matrix[i][j][k] = input.nextInt();
				}
			} 
		}

		//Constructor object
		Array3D a1= new Array3D(n1, n2, n3, matrix);

		//Calling print method
		a1.printMatrix();

		//Closing Scanner Class
		input.close();
	}
}
