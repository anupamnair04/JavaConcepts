package seed.jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class TestPreparedProduct {

	public static void main(String[] args) throws Exception {
		
		Connection con;
		con = MyConnection.getdbcConnection();
		
      /*PreparedStatement ps = con.prepareStatement("select * from product where code = ?");
		PreparedStatement ps = con.prepareStatement("select * from product where name = ?");
		PreparedStatement ps = con.prepareStatement("select * from product where price = ?");*/
		PreparedStatement ps = con.prepareStatement("select * from product where brand = ?");
		
		Scanner sc = new Scanner(System.in);
		
	  /*System.out.println("Enter Code:");
		int code = sc.nextInt();
		ps.setInt(1, code);
		
		System.out.println("Enter Name:");
		String name = sc.next();
		ps.setString(1, name);
		
		System.out.println("Enter Price:");
		double price = sc.nextInt();
		ps.setDouble(1, price);*/
		
		System.out.println("Enter Brand:");
		String brand = sc.next();
		ps.setString(1, brand);
		
		ResultSet rs = ps.executeQuery();
		
	     while(rs.next()){
	    	 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getString(4));
	     }
		sc.close();
		con.close();

	}
}