//Package Definition
package seed.generics;
//Class Definition
public class ParameterizedGenerics <T,V> {
	
    T o1;
    V o2;
    
    public ParameterizedGenerics (T o1, V o2){
    	this.o1 = o1;
    	this.o2 = o2;
    }
    public T getObject(){
    	return o1;
    }
    public V getObject1(){
    	return o2;
    }
}
