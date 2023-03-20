//Package Definition
package seed.swing;
//Import AWT Class
import java.awt.*;
//Import Java Swing
import javax.swing.*;
//Class Definition
public class Table extends JFrame{
     
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Table(){
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		String[]col={"Name","Subject","Branch","Marks","Total","Fees"};
		
		Object [][]data={{"Anupam","Java","SDETA","100","500","Paid"},
				         {"Anupam","Java","SDETA","100","500","Paid"},
				         {"Anupam","Java","SDETA","100","500","Paid"},
				         {"Anupam","Java","SDETA","100","500","Paid"},
				         {"Anupam","Java","SDETA","100","500","Paid"},
				         {"Anupam","Java","SDETA","100","500","Paid"},
				         {"Anupam","Java","SDETA","100","500","Paid"},
				         {"Anupam","Java","SDETA","100","500","Paid"},
				         {"Anupam","Java","SDETA","100","500","Paid"},
				         {"Anupam","Java","SDETA","100","500","Paid"},
				         {"Anupam","Java","SDETA","100","500","Paid"},
				         {"Anupam","Java","SDETA","100","500","Paid"},
				         {"Anupam","Java","SDETA","100","500","Paid"},
				         {"Anupam","Java","SDETA","100","500","Paid"},
				         {"Anupam","Java","SDETA","100","500","Paid"}};
		
		JTable t = new JTable(data,col);
		
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		
		JScrollPane jp = new JScrollPane(t,v,h);
		c.add(jp,BorderLayout.CENTER);
	}
}