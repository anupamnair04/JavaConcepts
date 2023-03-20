package seed.jdbcdemo;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Connected_JDBCRowSet {

	public static void main(String[] args) throws Exception {
		
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 
		    String url = "jdbc:oracle:thin:@localhost:1521:xe";
		    String username = "system";
		    String password = "anupam";
		    
		    JdbcRowSet rowset = RowSetProvider.newFactory().createJdbcRowSet();
		    rowset.setUrl(url);
		    rowset.setUsername(username);
		    rowset.setPassword(password);
		    
		    rowset.setCommand("select * from emp");
		    rowset.execute();
		    
		    while(rowset.next()){
		    	System.out.println(rowset.getInt(1)+" "+rowset.getString(2)+" "+rowset.getDouble(3));
		    }
		    rowset.close();
	}
}