//Package Definition
package com.Test;
//Import Packages
import Cricket.Batsman;
import Cricket.Bowler;
import Cricket.Player;
//Driver Code
public class TestCricket {
	
	public static void main(String[] args) {
		
		Player p1 = new Player();
	    System.out.println(p1);
	    
	    Player p2 = new Player(4, "Vaishnavi", "Zimbawe");
	    System.out.println(p2);
		
		Batsman b1 = new Batsman();
	    System.out.println(b1);
	    
	    Batsman b2 = new Batsman(5, "Saurabh", "Scotland", 200);
	    System.out.println(b2);

	    Bowler o1 = new Bowler();
	    System.out.println(o1);
	    
	    Bowler o2 = new Bowler(6, "Swara", "England", 10);
	    System.out.println(o2);
	}
}

