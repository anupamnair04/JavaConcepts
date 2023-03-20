//Package Definition
package seed.mvc;
//Class Definition
public class DemoTestMVC {

	public static void main(String[] args) {
		
		Model model = retrive();
		View view = new View();
		Controller control = new Controller(model,view);
		control.show();
		control.setSalary(50000);
		System.out.println("------Update Details------");
		control.show();
	}
	public static Model retrive(){
		Model m = new Model();
		
		m.setE_name("Anuapm");
		m.setE_id(1);
		m.setSalary(600000);
		m.setDept("IT Department");
		return m;
	}

}
