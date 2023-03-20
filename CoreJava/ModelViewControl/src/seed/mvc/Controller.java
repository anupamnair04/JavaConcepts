//Package Definition
package seed.mvc;
//Class Definition
public class Controller {

	private Model m;
	private View v;
	
	public Controller(Model m,View v){
		this.m=m;
		this.v=v;
	}
	
	public String getE_name() {
		return m.e_name;
	}
	public void setE_name(String e_name) {
		m.e_name = e_name;
	}
	public int getE_id() {
		return m.e_id;
	}
	public void setE_id(int e_id) {
		m.e_id = e_id;
	}
	public double getSalary() {
		return m.salary;
	}
	public void setSalary(double salary) {
		m.salary = salary;
	}
	public String getDept() {
		return m.dept;
	}
	public void setDept(String dept) {
		m.dept = dept;
	}
	
	public void show(){
		v.display(m.e_name, m.e_id, m.salary, m.dept);
	}
}
