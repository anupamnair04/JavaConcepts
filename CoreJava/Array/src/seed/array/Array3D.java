//Package Definition
package seed.array;
//Class Definition
public class Array3D {

	//Instance Variable
	int matrix[][][]=new int[100][100][100];
	int n1,n2,n3;

	//No Argument Constructor
	public Array3D(){

	}

	//Parameterized Constructor
	public Array3D(int n1, int n2, int n3, int[][][] matrix){
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;
		this.matrix=matrix;
	}

	//Print Matrix Method
	public void printMatrix(){
		for(int i=0;i<n1;i++){
			for(int j=0;j<n2;j++){
				for(int k=0;k<n3;k++){
					System.out.print("matrix["+i+"]["+j+"]["+k+"] = " +matrix[i][j][k]+"\t");
					System.out.print("\n");
				}
			}
		}
	}
}
