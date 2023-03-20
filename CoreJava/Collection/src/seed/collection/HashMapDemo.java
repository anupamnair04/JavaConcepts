//Package Definition
package seed.collection;
//Import HashMap Class
import java.util.HashMap;
//Import Map Class
import java.util.Map;
//Driver Code
public class HashMapDemo {
	
	public static void main(String[] args) {

		HashMap <Integer,String> h = new HashMap <Integer,String>();

		h.put(11,"Anu");
		h.put(12,"Anup");
		h.put(13,"Anupam");

		System.out.println(h);

		System.out.println("Output with Map Entry Interface");
		for(Map.Entry<Integer, String> n:h.entrySet()){
			System.out.println(n.getKey()+" "+n.getValue());
		}
	}
}
