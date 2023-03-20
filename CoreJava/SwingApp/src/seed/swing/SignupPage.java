//Package Definition
package seed.swing;
//Import AWT Class
import java.awt.*;
//Import AWT Action Event Interface
import java.awt.event.ActionEvent;
//Import AWT Event Action Listener Interface
import java.awt.event.ActionListener;
//Import Swing Class
import javax.swing.*;
//Class Definition
public class SignupPage extends JFrame implements ActionListener {

	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		//Variables
	    JPanel panel;
	    JLabel lbsignupname, lbpassword;
	    JTextField txtsignupname;
	    JPasswordField txtpassword;
	    JButton btnsignup,btncancel,btnclear;
	    
	    //Constructor
	    public SignupPage(){
	    	
	    	Container c = getContentPane();
	    	
	    	panel = new JPanel(new GridLayout(4,2,5,5));
	    	
	    	lbsignupname = new JLabel("User Name:");
	    	lbpassword = new JLabel("Password:");
	    	
	    	txtsignupname = new JTextField();
	    	txtpassword = new JPasswordField();
	    	
	    	btnsignup = new JButton("Signup");
	    	btncancel = new JButton("Cancel");
	    	btnclear = new JButton("Clear");
	    	
	    	panel.add(lbsignupname);
	    	panel.add(lbpassword);
	    	panel.add(txtsignupname);
	    	panel.add(txtpassword );
	    	panel.add(btnsignup);
	    	panel.add(btncancel );
	    	panel.add(btnclear);
	    	
	    	btnsignup.addActionListener(this);
	    	btncancel.addActionListener(this);
	    	btnclear.addActionListener(this);
	    	
	    	txtsignupname.requestFocus();
	    	c.add(panel);
	    	
	    	setVisible(true);
	    	setSize(350,150);
	    	setTitle("Signup");
	    	setLocationRelativeTo(null);
	    }
	
	    @SuppressWarnings("deprecation")
		@Override
		public void actionPerformed(ActionEvent ae) {
			
	    	if(ae.getSource()==btnsignup){
	    		if(txtsignupname.getText().equals("Anupam")
	    		&& txtpassword.getText().equals("Anupam")){
	    			JOptionPane.showMessageDialog(this,"Accepted");
	    		}
	    	    }else if(ae.getSource()==btncancel){
	    	      //windows cancel   
	    	    	panel.setVisible(false);
	   			  JOptionPane.showMessageDialog(this,"Closed");
	   		    }else if(ae.getSource()==btnclear){
	   		    	txtsignupname.setText("");
	   		    	txtpassword.setText("");
    			  JOptionPane.showMessageDialog(this,"Cleared");
	    	    }
		}	
}