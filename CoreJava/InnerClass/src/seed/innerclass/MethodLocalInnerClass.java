//Package Definition
package seed.innerclass;
//Method Local Inner Class Definition
public class MethodLocalInnerClass {
	
	int id = 1;
	//Instance Method
    public void show(){
    	String name ="Neha";
    	//Method Local Inner Class
    	class Inner{
    		int id = 10;
    		public void m1(){
    			System.out.println("Inner Class Method");
    			System.out.println(name);
    			System.out.println(id);
    		}
    	}
    	Inner obj = new Inner();
    	obj.m1();
    } 
}
