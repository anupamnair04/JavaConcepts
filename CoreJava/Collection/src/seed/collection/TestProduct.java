//Package Definition
package seed.collection;
//Import HashSet Class
import java.util.HashSet;
//Driver Code
public class TestProduct {
	
	public static void main(String[] args) {

		HashSet<Product> p = new HashSet<Product>();
		
		p.add(new Product(1,"TATA",1000.00));
		p.add(new Product(2,"BMW",2000.00));
		p.add(new Product(1,"TATA",3000.00));
		p.add(new Product(4,"BIRLA",2000.00));
		
		for(Product p1:p){
			System.out.println(p1);
		}
	}
}
