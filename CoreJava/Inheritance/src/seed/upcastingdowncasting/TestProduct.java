//Package Definition
package seed.upcastingdowncasting;
//Driver Code
public class TestProduct {
	
	public static void getAllproductInfo(Product p){
		p.productInfo();
		if (p instanceof Tv){
			p.price();
			
			Tv t = (Tv)p;
			t.tvInfo();
		}
		else if (p instanceof Laptop){
            p.price();
			
			Laptop l = (Laptop)p;
			l.laptopInfo();
		}
	}
	public static void main(String[] args) {
		
		Product p1 = new Tv();
		p1.price();
		
		Product p2 = new Laptop();
		p2.price();
		
		Product p3 = new Product();
		p3.price();
		
		Tv t2 = (Tv)p1;
		t2.tvInfo();

		Laptop l2 = (Laptop)p2;
		l2.laptopInfo();
		
		Product p4 = (Product)p3;
		p4.productInfo();
		
		System.out.println("----------------------");
		
		TestProduct.getAllproductInfo(p2);
	}
}
