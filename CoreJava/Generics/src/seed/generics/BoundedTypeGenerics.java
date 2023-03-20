//Package Definition
package seed.generics;
//Class Definition
public class BoundedTypeGenerics <T extends Number> {
	
    T obj;
    
    BoundedTypeGenerics (T obj){
	   this.obj = obj;
    }
    public T getNumber(){
	   return obj;
    }
}
