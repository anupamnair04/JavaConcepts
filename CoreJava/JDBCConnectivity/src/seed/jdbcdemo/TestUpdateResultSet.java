package seed.jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestUpdateResultSet {

	public static void main(String[] args) throws Exception {
		
		Connection con = MyConnection.getdbcConnection();
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
		ResultSet rs = stmt.executeQuery("select id,name,salary from emp order by id");
		
		while(rs.next()){
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		}
		System.out.println("----------------------------------------------");

		rs.last();
		int id = rs.getInt(1)+1;
		System.out.println(id);
		rs.moveToInsertRow();
		rs.updateInt(1,id);
		rs.updateString(2,"Sagar"); 
		rs.updateDouble(3,44000.0);
		rs.insertRow();	
		rs.beforeFirst();
			System.out.println("Rows inserted ....");
			System.out.println("-----------------all records are-------------");
			while(rs.next())
			{	  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getDouble(3));
			}
			
		// code to update
		rs.absolute(4); // moves cursor on 4th record
		rs.updateDouble(3, 61000.0);
		rs.updateRow();
		System.out.println("Rows updated  ....");
		System.out.println("-----------------all records are-------------");
		while(rs.next())
		{	  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getDouble(3));
		}	
		 
		//code to delete row
		rs.last();
    	rs.deleteRow();
    	System.out.println("row deleted  ....");
    		    	
	}
}