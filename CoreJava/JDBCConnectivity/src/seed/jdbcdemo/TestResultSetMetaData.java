package seed.jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class TestResultSetMetaData {

	public static void main(String[] args) throws Exception {
		
		Connection con = MyConnection.getdbcConnection();
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from emp");
		
		ResultSetMetaData rmd = rs.getMetaData();
		
		int n = rmd.getColumnCount();
		
		System.out.println("Colunm Count:"+n);

		for(int i=1; i<=n; i++){
			System.out.println("Colunm Name:"+rmd.getColumnName(i));
			System.out.println("Column Size:"+rmd.getColumnDisplaySize(i));
			System.out.println("Column Datatype:"+rmd.getColumnType(i));
            System.out.println("ColumnTypeName:"+rmd.getColumnTypeName(i));
            System.out.println("Colunm Name:"+rmd.getColumnClassName(i));
			System.out.println("Schema Name:"+rmd.getSchemaName(i));
			
			System.out.println("------------------------------");
		}
	}
}