package seed.jdbcdemo;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class TestInsertDemo {

	public static void main(String[] args) throws Exception{
		
		Connection con = MyConnection.getdbcConnection();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID:");
		int id = sc.nextInt();
		
		System.out.println("Enter the Name:");
		String name = sc.next();
		
		System.out.println("Enter Salary:");
		double salary = sc.nextDouble();
		
		String query = "insert into EMP values("+id+",'"+name+"',"+salary+")";
		
		Statement stmt = con.createStatement();
		
		int rows = stmt.executeUpdate(query);
		
		if(rows>0){
			System.out.println(rows+"rows inserted");
		}else{
			System.out.println("Data Insertion Failed");
		}
		stmt.close();
		con.close();
        sc.close();
	}
}