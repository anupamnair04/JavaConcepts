package seed.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class Disconnected_JDBCCachedSet {

	public static void main(String[] args) throws Exception {
		
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 
		    String url = "jdbc:oracle:thin:@localhost:1521:xe";
		    String username = "system";
		    String password = "anupam";
		    Connection con = DriverManager.getConnection(url, username, password);
		    Statement stmt = con.createStatement();
		    
		    ResultSet rs = stmt.executeQuery("select * from emp");
		    
		    CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
		    
		    crs.populate(rs);
		    
		    rs.close();
		    stmt.close();
		    con.close();
		    
		    while(crs.next()){
		    	System.out.println(crs.getInt(1)+" "+crs.getString(2)+" "+crs.getDouble(3));
		    }
	}
}