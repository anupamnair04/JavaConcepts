package seed.jdbcdemo;

import java.io.*;
import java.sql.*;

public class TestClobDemo {

	public static void main(String[] args) throws Exception {
		
		 Connection con=MyConnection.getdbcConnection();
		
			/*code to write clob into database
		      Statement st=con.createStatement();
		      st.execute("Create table info_clob(id number(10),data clob)");
		      System.out.println("Table created....");*/
		 
			PreparedStatement ps=con.prepareStatement("Insert into info_clob values(?,?)");
			
			FileReader r1= new FileReader("d:\\Anupam.txt");
			
		    ps.setInt(1, 1);
		    ps.setClob(2,r1);
		 
		    ps.executeUpdate();
		   
		    System.out.println("---------------------------------------------------");
		    
		    //code to read clob from database	 
		    PreparedStatement ps1=con.prepareStatement("select * from info_clob");
		    
		    ResultSet rs=ps1.executeQuery();
		    
		    System.out.println("Table content are:= ");
		    while (rs.next())
		    {    
		    System.out.println("id is "+rs.getInt(1));
		    Clob cb=rs.getClob(2);		    
			Reader b=cb.getCharacterStream();
		    int n;
		    
		    while((n=b.read())!=-1)
		    {
			    	System.out.print((char)n);
		    }
		    System.out.println();
		    } 
		    
		  //st.close();
		  //ps.close();
		    ps1.close();
		    con.close();
		}
}