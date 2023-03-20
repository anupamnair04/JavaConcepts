//Package Definition
package seed.swing;
//Import Swing Class
import javax.swing.*;
//Class Definition
public class Menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Menu(){
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu format = new JMenu("Format");
		
		mb.add(file);
		mb.add(edit);
		mb.add(format);
		
		JMenuItem New = new JMenuItem("New");
		JMenuItem open = new JMenuItem("Open");
		JMenuItem save = new JMenuItem("Save");
		
		file.add(New);
		file.add(open);
		file.add(save);
		
		JMenuItem cut = new JMenuItem("Cut");
		JMenuItem copy = new JMenuItem("Copy");
		JMenuItem delete = new JMenuItem("Delete");
		
		edit.add(cut);
		edit.add(copy);
		edit.add(delete);
		
		JMenuItem align = new JMenuItem("Align");
		JMenuItem color = new JMenuItem("Color");
		JMenuItem background = new JMenuItem("Background");
		
		format.add(align);
		format.add(color);
		format.add(background);
	}
}
