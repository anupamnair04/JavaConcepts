//Package Definition
package seed.serialization;
//Import Java IO Library
import java.io.*;
//Driver Code
public class DemStuDeserial {

	public static void main(String[] args) {
		
		FileInputStream fis;
		ObjectInputStream ois;
		
		try{
			DemoStudent s1;
			fis = new FileInputStream("D:\\Demo.txt");
			ois = new ObjectInputStream(fis);
			
			s1 = (DemoStudent)ois.readObject();
			s1.display();
			ois.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
