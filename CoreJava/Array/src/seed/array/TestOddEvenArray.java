//Package Definition
package seed.array;
//Driver Code
public class TestOddEvenArray {
	
	public static void main(String[] args) {		
	
		//Array
		int a[]={1,2,5,6,3,2};  
		//Logic For Odd Numbers
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length;i++){  
			if(a[i]%2!=0){  
				System.out.println(a[i]);  
			}  
		}  

		//Logic For Even Numbers
		System.out.println("Even Numbers:");  
		for(int i=0;i<a.length;i++){  
			if(a[i]%2==0){  
				System.out.println(a[i]);  
			}  
		}  
	}  
}