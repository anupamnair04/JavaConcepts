//Package Definition
package seed.swing;
//Import Java AWT
import java.awt.*;
//Import Swing Class
import javax.swing.*;
//Class Definition
public class EmployeeTable extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	EmployeeTable(){
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		String[]col={"ID","Name","Department","Salary"};
		
		Object [][]data={{"1","Anupam","SDETA","10000"},
				         {"2","Anupam","SDETA","10000"},
				         {"3","Anupam","SDETA","10000"},
				         {"4","Anupam","SDETA","10000"},
				         {"5","Anupam","SDETA","10000"},
				         {"6","Anupam","SDETA","10000"},
				         {"7","Anupam","SDETA","10000"},
				         {"8","Anupam","SDETA","10000"},
				         {"9","Anupam","SDETA","10000"},
				         {"10","Anupam","SDETA","10000"},
				         {"11","Anupam","SDETA","10000"}};
		
		JTable t = new JTable(data,col);
		
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		
		JScrollPane jp = new JScrollPane(t,v,h);
		c.add(jp,BorderLayout.CENTER);
	}
}