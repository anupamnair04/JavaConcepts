//Package Definition
package seed.generics;
//Class Definition
public class GenericDemo<T> {
	
	T obj;
	GenericDemo(T obj){
		this.obj=obj;
	}
	public T getObject(){
		return obj;
	}
}
