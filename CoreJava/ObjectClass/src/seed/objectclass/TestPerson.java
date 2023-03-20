//Package Definition
package seed.objectclass;
//Driver Code
public class TestPerson {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person(101,"Neha");
		Person p3 = p2;
		
		//Hash Method
		System.out.println("HashCode p1="+ p1.hashCode());
		System.out.println("HashCode p2="+ p2.hashCode());
		System.out.println("HashCode p3="+ p3.hashCode());
		
		System.out.println("---------------------------");
		
		//toString Method
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println("---------------------------");
		
		//equals Method
		System.out.println(p2==p3);
		System.out.println(p2.equals(p3));
		
		System.out.println("---------------------------");
		
		//Hash Method
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
	}
}
