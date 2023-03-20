//Package Definition
package Cricket;
//Super Class Definition
public class Player {
	
    int id;
    String name;
    String country;
    //No Arg Constructor
    public Player(){
	  id=0;
	  name="xxx";
	  country="yyy";
    }
    //Parameterized Constructor
    public Player(int id, String name, String country) {
	  super();
	  this.id = id;
	  this.name = name;
	  this.country = country;
    }
    @Override
    public String toString() {
	return "Player iDetails : "+id+name+country;
 }
}
