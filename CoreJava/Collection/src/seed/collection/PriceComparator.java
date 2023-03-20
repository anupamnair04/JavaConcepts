//Package Definition
package seed.collection;
//Import Comparator Class
import java.util.Comparator;
//Class Definition
public class PriceComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.price>p2.price){
			return 1;
		}else if(p1.price<p2.price){
			return -1;
		}else{
			return 0;
		}
	}
}
