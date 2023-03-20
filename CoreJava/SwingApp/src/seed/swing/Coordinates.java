//Package Definition
package seed.swing;
//Import AWT Class
import java.awt.*;
//Import Mouse Event Interface
import java.awt.event.MouseEvent;
//Import MouseMotionListner Interface
import java.awt.event.MouseMotionListener;
//Import Swing Class
import javax.swing.*;
//Class Definition
public class Coordinates extends JFrame implements MouseMotionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Variables
	JLabel cords;
	
	//Constructors
	public Coordinates(){
		
		Container c = getContentPane();
		JPanel panel = new JPanel();
		cords = new JLabel();
		
		panel.add(BorderLayout.CENTER,cords);
		
		c.add(panel);
		setVisible(true);
		setSize(500,500);
		setTitle("Coordinates");
		
		panel.addMouseMotionListener(this);
		setLocationRelativeTo(null);
	}

	@Override
	public void mouseMoved(MouseEvent me) {
		
		String data = "(X:"+ me.getX()+"(Y:"+ me.getY()+")";
		cords.setText("Coordinates:"+data);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}
}