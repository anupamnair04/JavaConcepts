package seed.jdbcdemo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class TestResultSetDatabaseMetaData {
	
   public static void main(String[] args) throws Exception {
		
		Connection con = MyConnection.getdbcConnection();
		
		DatabaseMetaData rmd = con.getMetaData();
		
			System.out.println("Driver Name:"+rmd.getDriverName());
			System.out.println("Driver Version:"+rmd.getDriverVersion());
			System.out.println("User Name:"+rmd.getUserName());
System.out.println("supportsMulResultSets:"+rmd.supportsMultipleResultSets());         System.out.println("supportsMulTransactions:"+rmd.supportsMultipleTransactions());
			
			System.out.println("------------------------------");
		}
}