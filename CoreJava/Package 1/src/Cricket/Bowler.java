//Package Definition
package Cricket;
//Sub Class Definition
public class Bowler extends Player {
	
   int wickets;
   //No Arg Constructor
   public Bowler(){
	   super();
	   wickets=0;
   }
   //Parameterized Constructor
   public Bowler(int id, String name, String country,int wickets) {
	  super(id, name, country);
	  this.wickets=wickets;
   }
   @Override
   public String toString() {
   return "Bowler Details"+wickets+id+name+country;
 }
}
