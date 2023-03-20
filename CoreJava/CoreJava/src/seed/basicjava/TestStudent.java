package seed.basicjava;
//Driver Code
public class TestStudent {
	public static void main(String[] args) {  
		
		//Create First Object
		Student s1=new Student();

		//Initialize First Object
		s1.id=01;
		s1.name="Anupam";
		s1.marks=67.3f;

		//Using instance Method
		//s1.instStudent(101,"Abdul",76.3f);
		//Print Student 1
		s1.printStudent();

		System.out.println("-------------------");

		//Create Second Object
		Student s2=new Student();

		/*Initialize Second Object
				s2.id=33;
				s2.name="Abhikesh";
				s2.marks=99.9f;
		*/

		//Using instance Method
		s2.instStudent(102,"Kadar",88.3f);

		//Print Student 2
		s2.printStudent();
	}
}
