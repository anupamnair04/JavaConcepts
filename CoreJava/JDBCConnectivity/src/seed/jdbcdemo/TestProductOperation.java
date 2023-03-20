package seed.jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestProductOperation {

	public static void main(String[] args) {
		
		Statement stmt = null;
		Connection con = null;
			
		try{
	           con = MyConnection.getdbcConnection();
			
		String query = "select count(*),max(price),min(price),avg(price) from product";
	         
			     stmt = con.createStatement();
			
			     ResultSet rs = stmt.executeQuery(query);
			     
			     while(rs.next()){
		
				    System.out.println("Num of products="+rs.getInt(1)+" "+"Max price="+rs.getDouble(2)+" "+"Min price="+rs.getDouble(3)+" "+"Avg price="+rs.getDouble(4));    
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