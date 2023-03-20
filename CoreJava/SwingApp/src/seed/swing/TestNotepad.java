//Package Definition
package seed.swing;
//Driver Code
public class TestNotepad {

	public static void main(String[] args) {
		
		Notepad n = new Notepad();
		
		 n.setTitle("Notepad");
	     n.setVisible(true);
	     n.setSize(800,600);
	     n.setLocationRelativeTo(null);
	}
}