//Package Definition
package seed.innerclass;
//Static Inner Class Definition
public class StaticInnerClass {
	
	  @SuppressWarnings("unused")
	  private int id = 10;
	  static String name = "Seed";

	   static class Inner{
		  public static void show(){
			  System.out.println(name);
		  }
		  public void msg(){
			  System.out.println("Inside Static Method");
		  }
	  }
}
