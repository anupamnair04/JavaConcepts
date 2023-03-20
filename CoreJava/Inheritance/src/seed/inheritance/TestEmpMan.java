//Package Definition
package seed.inheritance;
//Driver Code
public class TestEmpMan {
//Main Method
public static void main(String[] args) {
	
	   //Object Creation without parameter
	     Employee e1 = new Employee();
		 e1.printEmployee();
		 
		 Manager m1 = new Manager();
		 m1.printManager();
		 
		 WageEmp w1 = new WageEmp();
		 w1.printWageEmp();
		 
		 SalesEmp s1 = new SalesEmp();
		 s1.printSalesEmp();
		 
		 System.out.println("---------------------------");
		 
	   //Object Initialization with parameter
		 Employee e2 = new Employee(1,10000,"Anupam");
		 e2.printEmployee();
		 
		 Manager m2 = new Manager(2,20000,"Swagat",5000);
		 m2.printManager();
		 
		 WageEmp w2 = new WageEmp(3,30000,"Shikha",6000,10,30.00);
		 w2.printWageEmp();
		 
		 SalesEmp s2 = new SalesEmp(4,40000,"Anand",7000,20,40.00,3,50);
		 s2.printSalesEmp();
		 
		 System.out.println("---------------------------");
		 
		 Employee e3 = new Employee(5,50000,"Anand");
		 e3.CalSal();
		 
		 Manager m3 = new Manager(6,60000,"Shikha",6000);
		 m3.CalSal();
		 
		 WageEmp w3 = new WageEmp(7,70000,"Swagat",8000,40,60.00);
		 w3.CalSal();
		 
		 SalesEmp s3 = new SalesEmp(8,80000,"Anupam",9000,50,70.00,4,70);
		 s3.CalSal();
	}
}
