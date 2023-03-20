//Package Definition
package seed.swing;
//Import Java AWT
import java.awt.*;
//Import Java AWT Event
import java.awt.event.*;
//Import Java Swing
import javax.swing.*;
//Driver Code
public class DemoSwingApp {

	public static void main(String[] args) {
		
		final JFrame frame = new JFrame("JPasswordField Demo");
		
		JLabel lbluser = new JLabel("Username:");
		final JTextField tfuser = new JTextField(20);
		lbluser.setLabelFor(tfuser);
		
		JLabel lblpassword = new JLabel("Password:");
		final JPasswordField pfpassword = new JPasswordField(20);
		lblpassword.setLabelFor(pfpassword);
		
		JButton btncancel = new JButton("Cancel");
		JButton btnclear = new JButton("Clear");
		JButton btnlogin = new JButton("Submit");
		
		btncancel.addActionListener(new PerformActions());
		btnlogin.addActionListener(new PerformActions());
		btnclear.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent arg0){
				tfuser.setText("");
				pfpassword.setText("");
			}
		});
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(lbluser);
		panel.add(tfuser);
		panel.add(lblpassword);
		panel.add(pfpassword);
		panel.add(btnlogin);
		panel.add(btncancel);
		panel.add(btnclear);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,300);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

	}

}
class PerformActions implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String caption = arg0.getActionCommand();
		if(caption.equals("Submit")){
		System.out.println("Will be performing database operations later");
		}else if(caption.equals("Cancel")){
			System.out.println("Will need to stop executuion and return to base");
		}
	}
}	