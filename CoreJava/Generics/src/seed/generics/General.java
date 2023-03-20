//Package Definition
package seed.generics;
//Class Definition
public class General {
	
	Object o1;
	public General(){
		System.out.println("Its a General Class");
	}
	General(Object o1){
		this.o1=o1;
	}
	public Object getObject(){
		return o1;
	}
}
