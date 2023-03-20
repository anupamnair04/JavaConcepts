//Package Definition
package seed.innerclass;
//Outer Class Definition
public class SimpleInner {
	
    private int id = 10;
    String name = "Seed";
    
    //Inner Class Definition
    class Inner {
    	public void show(){
    		System.out.println("Inside Inner Class:"+" "+id+" "+name);
    	}
    }
}
