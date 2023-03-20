//Package Definition
package seed.agreegation;
//Class Definition
public class DisplayCities {
	
	//VariableArgument
	public void displayCities(String state,String...city){
		 System.out.println("State:"+state);
		 for(int i=0;i<city.length;i++){
			 System.out.println(city[i]);
		 } 
	 }
}