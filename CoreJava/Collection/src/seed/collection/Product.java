//Package Definition
package seed.collection;
//Class Definition
public class Product {
	
	//Instance Variable
	int id;
	String pname;
	double price;
	//No Arg Constructor
	public Product() {
		id = 0;
		pname = "xxx";
		price = 3000.00;
	}
	//Parameterized Constructor
	public Product(int id, String pname, double price) {
		this.id = id;
		this.pname = pname;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((pname == null) ? 0 : pname.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (pname == null) {
			if (other.pname != null)
				return false;
		} else if (!pname.equals(other.pname))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	//Print Method
	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", price=" + price + "]";
	}
}
