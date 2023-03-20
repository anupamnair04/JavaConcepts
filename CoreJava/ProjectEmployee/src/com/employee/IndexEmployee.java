package com.employee;

	import java.awt.EventQueue;
	import javax.swing.JFrame;
	import java.awt.Font;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.table.TableModel;
	import java.awt.Color;
	import javax.swing.border.EtchedBorder;
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;
	import java.sql.*;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import java.awt.event.MouseAdapter;
	import java.awt.event.MouseEvent;

	public class IndexEmployee {

		private JFrame frmCurdOperationSwing;
		private JTextField txtID;
		private JTextField txtName;
		private JTextField txtSalary;
		private JTable table;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						IndexEmployee window = new IndexEmployee();
						window.frmCurdOperationSwing.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public IndexEmployee() {
			initialize();
			 Connect();
			 loadData();
		}
			
		    //Database Connection
		    Connection con = null;
		    PreparedStatement pst;
		    ResultSet rs;
		
		    public void Connect() {
			    try {
				    Class.forName("oracle.jdbc.driver.OracleDriver");
				    String url = "jdbc:oracle:thin:@localhost:1521:xe";
				    String username = "system";
				    String password = "anupam";
				    con = DriverManager.getConnection(url, username, password);
			    } catch (Exception ex) {
				    ex.printStackTrace();
			    }
		    }
		
		    // Clear All
			public void clear() {
				txtID.setText("");
				txtName.setText("");
				txtSalary.setText("");
				txtID.requestFocus();
			}
		
			// Load Table
			public void loadData() {
				try {
					pst = con.prepareStatement("Select * from emp");
					rs = pst.executeQuery();
					table.setModel(DBUtils.resultSetToTableModel(rs));

				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			
		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			
			frmCurdOperationSwing = new JFrame();
			frmCurdOperationSwing.setTitle("JAVA PROJECT");
			frmCurdOperationSwing.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
			frmCurdOperationSwing.getContentPane().setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Employee Management System");
			lblNewLabel.setForeground(Color.RED);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel.setBounds(10, 11, 259, 60);
			frmCurdOperationSwing.getContentPane().add(lblNewLabel);
			
			JPanel panel = new JPanel();
			panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			panel.setBounds(20, 71, 387, 284);
			frmCurdOperationSwing.getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel_1 = new JLabel("Id");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1.setBounds(21, 46, 46, 24);
			panel.add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_1 = new JLabel("Name");
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1_1.setBounds(21, 81, 46, 24);
			panel.add(lblNewLabel_1_1);
			
			JLabel lblNewLabel_1_2 = new JLabel("Salary");
			lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1_2.setBounds(21, 116, 46, 24);
			panel.add(lblNewLabel_1_2);
			
			txtID = new JTextField();
			txtID.setEditable(true);
			txtID.setFont(new Font("Tahoma", Font.PLAIN, 14));
			txtID.setBounds(78, 46, 287, 24);
			panel.add(txtID);
			txtID.setColumns(10);
			
			txtName = new JTextField();
			txtName.setFont(new Font("Tahoma", Font.PLAIN, 14));
			txtName.setColumns(10);
			txtName.setBounds(78, 81, 287, 24);
			panel.add(txtName);
			
			txtSalary = new JTextField();
			txtSalary.setFont(new Font("Tahoma", Font.PLAIN, 14));
			txtSalary.setColumns(10);
			txtSalary.setBounds(78, 120, 287, 24);
			panel.add(txtSalary);
			
			JButton btnSave = new JButton("Save");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String id = txtID.getText();
					String name = txtName.getText();
					String salary = txtSalary.getText();
					
					if (id == null || id.isEmpty() || id.trim().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Please Enter ID");
						txtID.requestFocus();
						return;
					}
					if (name == null || name.isEmpty() || name.trim().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Please Enter Name");
						txtName.requestFocus();
						return;
					}
					if (salary == null || salary.isEmpty() || salary.trim().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Please Enter Salary");
						txtSalary.requestFocus();
						return;
					}
					
					if (txtID.getText() != null) {
						try {
							String sql = "insert into emp (ID,NAME,SALARY) values (?,?,?)";
							pst = con.prepareStatement(sql);
							pst.setString(1, id);
							pst.setString(2, name);
							pst.setString(3, salary);
							pst.executeUpdate();
							JOptionPane.showMessageDialog(null, "Data Insert Success");
							clear();
							loadData();

						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
				}
			});
			btnSave.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnSave.setBounds(78, 195, 89, 23);
			panel.add(btnSave);
			
			JButton btnUpdate = new JButton("Update");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					// Update Details
					String id = txtID.getText();
					String name = txtName.getText();
					String salary = txtSalary.getText();

					if (name == null || name.isEmpty() || name.trim().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Please Enter Name");
						txtName.requestFocus();
						return;
					}
					if (salary == null || salary.isEmpty() || salary.trim().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Please Enter Salary");
						txtSalary.requestFocus();
						return;
					}

					if (!txtID.getText().isEmpty()) {
						try {
							String sql = "update emp set NAME=?,SALARY=? where ID=?";
							pst = con.prepareStatement(sql);
							pst.setString(1, name);
							pst.setString(2, salary);
							pst.setString(3, id);
							pst.executeUpdate();
							JOptionPane.showMessageDialog(null, "Data Update Success");
							clear();
							loadData();

						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
				}
			});
			btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnUpdate.setBounds(177, 195, 89, 23);
			panel.add(btnUpdate);
			
			JButton btnDelete = new JButton("Delete");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					// Delete Details
					String id = txtID.getText();
					if (!txtID.getText().isEmpty()) {

						int result = JOptionPane.showConfirmDialog(null, "Sure? You want to Delete?", "Delete",
								JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

						if (result == JOptionPane.YES_OPTION) {
							try {
								String sql = "delete from emp where ID=?";
								pst = con.prepareStatement(sql);
								pst.setString(1, id);
								pst.executeUpdate();
								JOptionPane.showMessageDialog(null, "Data Deleted Success");
								clear();
								loadData();

							} catch (SQLException e1) {
								e1.printStackTrace();
							}
						}
					}
				}
			});
			btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnDelete.setBounds(276, 195, 89, 23);
			panel.add(btnDelete);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(417, 71, 467, 284);
			frmCurdOperationSwing.getContentPane().add(scrollPane);
			
			table = new JTable();
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					int index = table.getSelectedRow();
					TableModel model = table.getModel();
					
					// ID NAME SALARY
					txtID.setText(model.getValueAt(index, 0).toString());
					txtName.setText(model.getValueAt(index, 1).toString());
					txtSalary.setText(model.getValueAt(index, 2).toString());
				}
			});
			table.setFont(new Font("Tahoma", Font.PLAIN, 14));
			table.setRowHeight(30);
			scrollPane.setViewportView(table);
			frmCurdOperationSwing.setBounds(100, 100, 910, 522);
			frmCurdOperationSwing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}