//Package Definition
package Cricket;
//Sub Class Definition
public class Batsman extends Player{
	
    int runs;
    //No Arg Constructor
    public Batsman(){
	   super();
	   runs = 00;
    }
    //Parameterized Constructor
    public Batsman(int id, String name, String country, int runs) {
	  super(id, name, country);
	  this.runs = runs;
    }
    @Override
    public String toString() {
	return "Batsman Details : "+runs+id+name+country;
}
}
