package seed.jdbcdemo;

import java.sql.Connection;

public class TestMyConnection {

	public static void main(String[] args) throws Exception {
		
		Connection con = MyConnection.getdbcConnection();

		System.out.println("Connection !");
		
		con.close();
	}
}