package seed.jdbcdemo;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class TestPropertiesDemo {

	public static void main(String[] args) throws Exception {

    FileInputStream fin = new FileInputStream("config.properties");
    Properties p = new Properties();
    p.load(fin);
    
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    
    String uid = p.getProperty("username");
    String pwd = p.getProperty("userpassword");
    
    Connection con = DriverManager.getConnection(url,uid,pwd);
    System.out.println("Connected");
    PreparedStatement ps = con.prepareStatement("select * from emp");
    
    ResultSet rs = ps.executeQuery();
    
    while(rs.next()){
    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
    }
	}
}