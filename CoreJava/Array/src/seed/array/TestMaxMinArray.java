//Package Definition
package seed.array;
//Driver Code
public class TestMaxMinArray {
	
	//Method to find maximum element
	public int max(int [] array) {
		//Variable for maximum element
		int max = 0;
		//Logic to find maximum element		     
		for(int i=0; i<array.length; i++ ) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		return max;
	}
	//Method to find maximum element
	public int min(int [] array) {
		//Variable for maximum element
		int min = array[0];
		//Logic to find maximum element
		for(int i=0; i<array.length; i++ ) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		return min;
	}

	public static void main(String args[]) {
		
		int[] myArray = {23, 92, 56, 39, 93};
		TestMaxMinArray m = new TestMaxMinArray();
		System.out.println("Maximum value in the array is::"+m.max(myArray));
		System.out.println("Minimum value in the array is::"+m.min(myArray));
	}
}
