//Package Definition
package seed.array;
//Class Definition
public class Array2D {

	//Instance Variable
	int row,col;
	int[][]matrix=new int[100][100];

	//No Argument Constructor
	public Array2D(){

	}

	//Parameterized Constructor
	public Array2D(int row, int col,int[][]matrix ){
		this.row=row;
		this.col=col;
		this.matrix=matrix;
	}

	//Print Matrix Method
	public void printMatrix(){
		System.out.println("Matrix");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.println(matrix[i][j]);
			}
		}
	}
}
