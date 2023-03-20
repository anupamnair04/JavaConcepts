//Package Definition
package seed.throwss;
//Import IO Exception
import java.io.IOException;
//Import SQL Exception
import java.sql.SQLException;
//Driver Code
public class TestThrows {
	
	public static void main(String[] args) {

		ThrowsDemo d = new ThrowsDemo();
		try {
			System.out.println(d.getbalance(1111, true));
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}
}
