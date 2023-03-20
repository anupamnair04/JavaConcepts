//Package Definition
package TestCricket;
//Import Package
import Cricket.*;
//Driver Code
public class TestCricket {
	
	public static void main(String[] args) {
		
		Player p1 = new Player();
	    System.out.println(p1);
	    
	    Player p2 = new Player(1, "Anupam", "India");
	    System.out.println(p2);
		
		Batsman b1 = new Batsman();
	    System.out.println(b1);
	    
	    Batsman b2 = new Batsman(2, "Swagat", "South Africa", 100);
	    System.out.println(b2);

	    Bowler o1 = new Bowler();
	    System.out.println(o1);
	    
	    Bowler o2 = new Bowler(3, "Shreyash", "Ireland", 5);
	    System.out.println(o2);

	}
}
