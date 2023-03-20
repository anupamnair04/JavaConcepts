//Package Definition
package seed.swing;
//Import Swing
import javax.swing.*;
//Import Java AWT
import java.awt.*;
//Class Definition
public class LoginPage extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Variables
    JPanel panel;
    JLabel lbloginname, lbpassword;
    JTextField txtloginname;
    JPasswordField txtpassword;
    JButton btnlogin,btncancel,btnclear;
    
    //Constructor
    public LoginPage(){
    	
    	Container c = getContentPane();
    	
    	panel = new JPanel(new GridLayout(4,2,5,5));
    	
    	lbloginname = new JLabel("User Name:");
    	lbpassword = new JLabel("Password:");
    	
    	txtloginname = new JTextField();
    	txtpassword = new JPasswordField();
    	
    	btnlogin = new JButton("Login");
    	btncancel = new JButton("Cancel");
    	btnclear = new JButton("Clear");
    	
    	panel.add(lbloginname);
    	panel.add(lbpassword);
    	panel.add(txtloginname);
    	panel.add(txtpassword );
    	panel.add(btnlogin);
    	panel.add(btncancel );
    	panel.add(btnclear);
    	
    	txtloginname.requestFocus();
    	c.add(panel);
   
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    	setSize(350,150);
    	setLocationRelativeTo(null);
    }
}
