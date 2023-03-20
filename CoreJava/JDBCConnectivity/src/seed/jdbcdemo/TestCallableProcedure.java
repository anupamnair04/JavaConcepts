package seed.jdbcdemo;

import java.sql.CallableStatement;
import java.sql.Connection;

public class TestCallableProcedure {

	public static void main(String[] args) throws Exception {
		
		Connection con = MyConnection.getdbcConnection();
		CallableStatement stmt = con.prepareCall("{call updatesal(?,?)}");
		
		stmt.setInt(1, 5);
		stmt.setDouble(2, 10101.00);
		
		stmt.execute();
		
		System.out.println("Done.");

	}
}