//Package Definition
package seed.serialization;
//Import Java IO Library
import java.io.*;
//Driver Code
public class DemStuSerial {

	public static void main(String[] args) {
		
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try{
			DemoStudent s1 = new DemoStudent("Anupam",1,60);
			fos = new FileOutputStream("D:\\Demo.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(s1);
			oos.close();
			System.out.println("Written Object Done");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
