package seed.jdbcdemo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestDeleteProduct {

	public static void main(String[] args) throws Exception {
		
	Statement stmt = null;
	Connection con = null;
		
	try{
           con = MyConnection.getdbcConnection();
		
	       Scanner sc = new Scanner(System.in);
      	   System.out.println("Enter Code:");
		   int code = sc.nextInt();
		
		String query = "delete from PRODUCT where code ="+ code;
		
		stmt = con.createStatement();
		
		int rows = stmt.executeUpdate(query);
		
		if(rows>0){
			System.out.println(rows+"rows deleted");
		}else{
			System.out.println(rows+"Data Deleted Failed");
		}
		sc.close();
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
		stmt.close();
		con.close();
	}
}