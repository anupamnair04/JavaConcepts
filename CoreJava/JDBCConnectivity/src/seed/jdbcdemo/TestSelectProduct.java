package seed.jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Scanner;
import java.util.Scanner;

public class TestSelectProduct {

	public static void main(String[] args) {
		
	Statement stmt = null;
	Connection con = null;
		
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter Code:");
		int code = sc.nextInt();
		
	
	try{
           con = MyConnection.getdbcConnection();
		
		     //String query = "select * from PRODUCT";
             String query = "select * from PRODUCT where code ="+ code;
             //String query = "select name,price from PRODUCT where price between 20000.0  and  45000.0";
		     stmt = con.createStatement();
		
		     ResultSet rs = stmt.executeQuery(query);
		
		     while(rs.next()){
		    	 System.out.println(" "+rs.getInt("code"));
		    	 System.out.println(" "+rs.getString(2));
		         System.out.println(" "+rs.getDouble(3));
		    	 System.out.println(" "+rs.getString(4));
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
	sc.close();
	}
}