//Package Definition
package seed.methodoverloading;
//Class Definition
public class MethodOverloading {
	
	//Instance Method
	public void add(int a,int b){
		System.out.println("Sum:"+" "+(a+b));
	}
	public void add(float a,float b){
		System.out.println("Sum:"+" "+(a+b));
	}
	public float add(int a,float b){
		return a+b;
	}
	public float add(float a,int b){
		return a+b;
	}
}
