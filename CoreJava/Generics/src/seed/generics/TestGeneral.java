//Package Definition
package seed.generics;
//Driver Code
public class TestGeneral {
	
	public static void main(String[] args) {

		General g = new General(new Integer(10));
		Integer i = (Integer) g.getObject();
		System.out.println(i);

		General g1 = new General(new Integer(10));
		Integer i1 = (Integer) g1.getObject();
		System.out.println(i1);

		General g2 = new General();
		g2.getObject();
	}
}
