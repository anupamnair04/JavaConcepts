package seed.jdbcdemo;

import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.sql.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class TestBlobDemo extends JFrame {

	JButton b1,b2;
	JLabel l1;
	Connection con;
	String url;
	
	public TestBlobDemo() throws Exception
	{
		b1=new JButton("Insert");
		b2=new JButton("Display");
		l1=new JLabel();

		add(b1);
		add(b2);
		add(l1);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(1000, 1000);
		
		Connection con= MyConnection.getdbcConnection();
		
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				PreparedStatement ps;
				try {
					ps = con.prepareStatement("insert into product_img values(?,?)");
					ps.setString(1,"Frame");
					FileInputStream fin=new FileInputStream("d:\\download.jpg");  
					ps.setBinaryStream(2,fin,fin.available());  
					int i=ps.executeUpdate();  
					JOptionPane.showMessageDialog( TestBlobDemo.this, i+" record inserted");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		b2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try
				{
					Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE); 	
					ResultSet rs=stmt.executeQuery("select pname,photo from product_img");

					rs.first();
					Blob b1=rs.getBlob(2); 
					byte barr[]=b1.getBytes(1, (int)b1.length());

					l1.setIcon(new ImageIcon(barr));
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
	}
	
	public static void main(String[] args) throws Exception {
		
		TestBlobDemo d= new TestBlobDemo();
		d.setVisible(true);
		d.setSize(400, 400);
	}
}