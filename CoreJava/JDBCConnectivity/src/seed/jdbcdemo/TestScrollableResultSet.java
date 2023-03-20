package seed.jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestScrollableResultSet {

	public static void main(String[] args) throws Exception {
		
		Connection con = MyConnection.getdbcConnection();
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
		ResultSet rs = stmt.executeQuery("select * from emp");
		
		while(rs.next()){
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		}
		System.out.println("----------------------------------------------");
		
		//Access Third Record
		rs.absolute(3);
		System.out.println("Third Record:");
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		
		System.out.println("----------------------------------------------");
		
		//Move Forward 2 Records
		rs.relative(2);
		System.out.println("Relative Record:");
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		
		System.out.println("----------------------------------------------");
		
		//Moves the cursor forward one row from its current position
		rs.next();
		System.out.println("Next Record:");
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		
		System.out.println("----------------------------------------------");
		
		//Moves the cursor to the previous row in this ResultSet object. 
		rs.previous();
		System.out.println("Previous Record:");
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		
		System.out.println("----------------------------------------------");
		
		//Moves the cursor forward one row from its current position
		rs.first();
		System.out.println("First Record:");
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		
		System.out.println("----------------------------------------------");
		
		//Moves the cursor to the last row in this ResultSet object.
		rs.last();
		System.out.println("Last Record:");
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		
		System.out.println("----------------------------------------------");
		
		//Moves the cursor to the front of this ResultSet object, just before the first row
		rs.beforeFirst();
		System.out.println("BeforeFirst Record:");
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		
		System.out.println("----------------------------------------------");
		
		//Moves the cursor to the end of this ResultSet object, just after the last row
		rs.afterLast();
		System.out.println("AfterLast Record:");
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		
		con.close();
		stmt.close();
	}
}
