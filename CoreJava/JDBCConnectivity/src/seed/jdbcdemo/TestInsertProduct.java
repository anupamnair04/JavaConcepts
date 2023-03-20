package seed.jdbcdemo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsertProduct {

	public static void main(String[] args) throws Exception {
		
       /* try(Connection con = MyConnection.getdbcConnection();
        	Statement stmt = con.createStatement();){
        	
		System.out.println("Insert records into the table");  
		
        String query = "INSERT INTO PRODUCT VALUES (4, 'Mobile', 12345)";
        stmt.executeUpdate(query);
        
        query = "INSERT INTO PRODUCT VALUES (5, 'Laptop', 56789)";
        stmt.executeUpdate(query);
        
        query = "INSERT INTO PRODUCT VALUES (6, 'Television', 13579)";
        stmt.executeUpdate(query);
        
        query = "INSERT INTO PRODUCT VALUES(7, 'Mobile', 24680)";
        stmt.executeUpdate(query);
        
        query = "INSERT INTO PRODUCT VALUES(8, 'Laptop', 45000)";
        stmt.executeUpdate(query);
        
        query = "INSERT INTO PRODUCT VALUES(9, 'Television', 34000)";
        stmt.executeUpdate(query);
        
        query = "INSERT INTO PRODUCT VALUES(10, 'Mobile', 32000)";
        stmt.executeUpdate(query);
        
        System.out.println("Inserted records into the table");   	  
     }
     catch(SQLException e){
		e.printStackTrace();
	}	*/
		
	Statement stmt = null;
	Connection con = null;
		
	try{
          con = MyConnection.getdbcConnection();
          stmt = con.createStatement();
            
          stmt.addBatch("INSERT INTO PRODUCT VALUES (1, 'Mobile', 12345,'Sony')");
          stmt.addBatch("INSERT INTO PRODUCT VALUES (2, 'Laptop', 56789,'Samsung')");
          stmt.addBatch("INSERT INTO PRODUCT VALUES(3, 'Mobile', 32000,'Apple')");
            
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