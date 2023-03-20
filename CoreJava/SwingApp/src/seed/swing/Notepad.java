//Package Definition
package seed.swing;
//Import Java AWT Class
import java.awt.*;
//Import Java AWT Event Class
import java.awt.event.*;
//Import Swing Class
import javax.swing.*;
//Class Definition
public class Notepad extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextArea whitebox;
	String selection ="";
	FileDialog f,f1;
	
    public Container createContentPane(){	
        whitebox = new JTextArea();
        whitebox.setEditable(false);
        whitebox.setLineWrap(true);
        whitebox.setWrapStyleWord(true);
        whitebox.setMinimumSize(new Dimension(300, 200));
        whitebox.setPreferredSize(new Dimension(300, 200));
        whitebox.setMaximumSize(new Dimension(300, 200));

        JPanel totalGUI = new JPanel();
        totalGUI.add(whitebox);
        
        totalGUI.setOpaque(true);
        return totalGUI;
    }
    
	Notepad(){
	
	f1 = new FileDialog(this,"Save",FileDialog.SAVE);	
			
	JMenuBar mb = new JMenuBar();
	setJMenuBar(mb);
	
	//MenuBar File
	JMenu file = new JMenu("File");
	mb.add(file);
			
	//MenuItems File
	JMenuItem New = new JMenuItem("New");
	file.add(New);
	New.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_MASK));
			
	JMenuItem newwindow = new JMenuItem("New Window");
	file.add(newwindow);
			
	JMenuItem open = new JMenuItem("Open");
	file.add(open);
	open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_MASK));
			
	JMenuItem save = new JMenuItem("Save");
	file.add(save);
	save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
			
	JMenuItem saveas = new JMenuItem("Save As",KeyEvent.VK_S);
	file.add(saveas);
	file.addSeparator();
	
	JMenuItem pagesetup = new JMenuItem("Page Setup");
	file.add(pagesetup);
			
	JMenuItem print = new JMenuItem("Print");
	file.add(print);
	print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,InputEvent.CTRL_MASK));
	file.addSeparator();
	
	JMenuItem exit = new JMenuItem("Exit");
	file.add(exit);
	
	//MenuBar Edit
	JMenu edit = new JMenu("Edit");
	mb.add(edit);
	
	//MenuItems Edit
	JMenuItem undo = new JMenuItem("Undo");
	edit.add(undo);
	undo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,InputEvent.CTRL_MASK));
	edit.addSeparator();
	
	JMenuItem cut = new JMenuItem("Cut");
	edit.add(cut);
	cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.CTRL_MASK));
	
	JMenuItem copy = new JMenuItem("Copy");
	edit.add(copy);
	copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_MASK));
	
	JMenuItem paste = new JMenuItem("Paste");
	edit.add(paste);
	paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,InputEvent.CTRL_MASK));
	
	JMenuItem delete = new JMenuItem("Delete");
	edit.add(delete);
	delete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE,0));
	edit.addSeparator();
	
	
	JMenuItem find = new JMenuItem("Find");
	edit.add(find);
	find.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,InputEvent.CTRL_MASK));
	
	JMenuItem findnext = new JMenuItem("Find Next");
	edit.add(findnext);
	findnext.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3,0)); 
	
	JMenuItem findprevious = new JMenuItem("Find Previous");
	edit.add(findprevious);
	findprevious.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3,InputEvent.SHIFT_MASK));
	
	JMenuItem replace = new JMenuItem("Replace");
	edit.add(replace);
	replace.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,InputEvent.CTRL_MASK));
	
	JMenuItem Goto = new JMenuItem("Go to");
	edit.add(Goto);
	Goto.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,InputEvent.CTRL_MASK));
	edit.addSeparator();
	
	JMenuItem selectall = new JMenuItem("Select All");
	edit.add(selectall);
	selectall.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,InputEvent.CTRL_MASK));
	
	JMenuItem TimeDate = new JMenuItem("Time/Date");
	edit.add(TimeDate);
	TimeDate.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5,0));  
	edit.addSeparator();
	
	JMenuItem font = new JMenuItem("Font");
	edit.add(font);	
			
	//MenuBar View
	JMenu view = new JMenu("View");
	mb.add(view);
	
	//MenuItems Edit
	JMenuItem zoom = new JMenuItem("Zoom");
	view.add(zoom);
	
	
	JMenuItem statusbar = new JMenuItem("Status Bar");
	view.add(statusbar);
	
	
	JMenuItem wordwrap = new JMenuItem("Word Wrap");
	view.add(wordwrap);	
			
				
	}
		@Override
		public void actionPerformed(ActionEvent e) {
			 whitebox.append(e.getActionCommand() + " Selected \n");
			
		}
}
