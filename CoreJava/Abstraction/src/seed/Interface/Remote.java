package seed.Interface;
//Interface Class definition
public interface Remote {
	
    default public int Volume() {
		return 0;
	}
    public int Battery();
    
    public static void Company(){
    	System.out.println("Videocon D2H");
    }
}
