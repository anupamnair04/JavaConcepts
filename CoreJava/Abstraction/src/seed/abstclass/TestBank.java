//Package Definition
package seed.abstclass;
//Driver Code
public class TestBank {
	public static void main(String[] args) {
		
		Bank b;
		b = new Pnb();
		System.out.println(b.sendmsg("Pnb - "));
		System.out.println("Rate of Interest is: "+b.getroi()+" %");
		
		System.out.println("------------------");
		
		Sbi s;
		s = new Pnb();
		System.out.println(s.sendmsg("Pnb - "));
		System.out.println("Rate of Interest is: "+s.getroi()+" %");
		
		System.out.println("---------------");
		
	  /*b = new Sbi();
		System.out.println(b.sendmsg("Sbi - "));
		System.out.println("Rate of Interest is: "+b.getroi()+" %");
		
		
		Sbi s1 = new Sbi();
		System.out.println(s1.getroi());
		
		Pnb p1 = new Pnb();
		System.out.println(p1.getroi());*/
	}
}
