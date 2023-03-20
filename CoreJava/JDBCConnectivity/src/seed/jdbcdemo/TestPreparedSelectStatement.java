package seed.jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class TestPreparedSelectStatement {

	public static void main(String[] args) throws Exception {
		
		Connection con;
		con = MyConnection.getdbcConnection();
		
		PreparedStatement ps = con.prepareStatement("select * from emp where salary>?");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Salary:");
		Double salary = sc.nextDouble();
		ps.setDouble(1,salary);
		
		ResultSet rs = ps.executeQuery();
		
	     while(rs.next()){
	    	 System.out.println(rs.getInt("id")+" "+rs.getString(2)+" "+rs.getDouble(3));
	     }
		sc.close();
		con.close();

	}
}