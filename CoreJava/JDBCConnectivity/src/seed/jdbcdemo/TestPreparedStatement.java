package seed.jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class TestPreparedStatement {

	public static void main(String[] args) throws Exception {
		
	Connection con;
	con = MyConnection.getdbcConnection();
	
	PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?)");
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter ID:");
	int id = sc.nextInt();
	ps.setInt(1,id);
	
	System.out.println("Enter Name:");
	String name  = sc.next();
	ps.setString(2,name);
	
	System.out.println("Enter Salary:");
	Double salary = sc.nextDouble();
	ps.setDouble(3,salary);
	
	int p = ps.executeUpdate();
	
	System.out.println(p + "Row Inserted");

	PreparedStatement pss = con.prepareStatement("update emp set name = ? where id = ?");
	
	System.out.println("Enter Name:");
	String namee  = sc.next();
	pss.setString(1, namee);
	
	System.out.println("Enter ID:");
	int idd = sc.nextInt();
	pss.setInt(2,idd);
	
	int pp = pss.executeUpdate();
	
	System.out.println(pp + "Row Inserted");
	
	PreparedStatement psp = con.prepareStatement("delete from emp where id=?");
	
	System.out.println("Enter ID:");
	int iid = sc.nextInt();
	psp.setInt(1,iid);
	
	int ppp = psp.executeUpdate();
	
	System.out.println(ppp + "Row deleted");
	sc.close();
	con.close();
	}
}