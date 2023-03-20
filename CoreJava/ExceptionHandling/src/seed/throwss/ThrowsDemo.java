//Package Definition
package seed.throwss;
//Import Java IO Exception 
import java.io.IOException;
//Import Java SQL Exception 
import java.sql.SQLException;
//Class Definition
public class ThrowsDemo {

	double balance = 35000.00;
	boolean status = false;
	private int pin = 1111;

	public double getbalance(int pin, boolean status) throws SQLException, IOException
	{
		try{
			if(this.pin!=pin){
				throw new IOException("Wrong Pin");
			}if(status==false){
				throw new SQLException("Check Connection");
			} else {
				return balance;
			}
		} finally {
			System.out.println("Close Connection");
		}
	}
}
