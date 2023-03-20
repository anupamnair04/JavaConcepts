//Package Definition
package seed.generics;
//Driver Code
public class TestParameterizedGenerics {
	
	public static void main(String[] args) {
		
	ParameterizedGenerics<String, Integer> g = new ParameterizedGenerics<String, Integer>("Anupam",1);
    String nm = g.getObject();
    Integer id = g.getObject1();
    System.out.println(id+" "+nm);
  }
}
