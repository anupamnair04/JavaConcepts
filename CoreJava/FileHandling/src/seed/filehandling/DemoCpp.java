//Package Definition
package seed.filehandling;
//Import Java IO Library
import java.io.*;
//Class Definition
public class DemoCpp {

	public static void main(String[] args) {
		
		try{
			File f;
			FileInputStream fis;
			FileOutputStream fos;
			int x;
			
			f = new File("D:\\Demo.txt");
			fis = new FileInputStream(f);
			fos = new FileOutputStream("D:\\Demo1.txt");
			
			do{
				x = fis.read();
				System.out.println(x);
				if(x!=-1)
					fos.write((char)x);
			} while(x!=-1);
			
			fis.close();
			fos.close();
			System.out.println("Done");
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
