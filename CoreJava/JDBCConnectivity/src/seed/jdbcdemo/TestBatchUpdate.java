package seed.jdbcdemo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestBatchUpdate {

	public static void main(String[] args) {
		
	Statement stmt = null;
	Connection con = null;
		
	try{
          con = MyConnection.getdbcConnection();
          stmt = con.createStatement();
            
          stmt.addBatch("insert into emp values(5,'Surbhi',23400)");
          stmt.addBatch("insert into emp values(6,'Vedant',34200)");
          stmt.addBatch("insert into emp values(7,'Aishwariya',43200)");
            
          stmt.addBatch("delete from emp where id = 3");
            
          stmt.addBatch("update emp set name ='Anand' where id = 4");
            
          @SuppressWarnings("unused")
	   	  int arr[]=stmt.executeBatch();
          System.out.println("Operation Executed");
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