package seed.jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelectDemo {

	public static void main(String[] args) {
		
		Statement stmt = null;
		Connection con = null;
		
		try{
             con = MyConnection.getdbcConnection();
		
		     String query = "select * from EMP";
		
		     stmt = con.createStatement();
		
		     ResultSet rs = stmt.executeQuery(query);
		
		     while(rs.next()){
		    	 System.out.println(" "+rs.getInt(1));
		    	 System.out.println(" "+rs.getString(2));
		    	 System.out.println(" "+rs.getDouble(3));
		     }
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				stmt.close();
				con.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}