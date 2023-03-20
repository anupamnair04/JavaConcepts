//Package Definition
package seed.filehandling;
//Import Java IO Library
import java.io.*;
//Class Definition
public class DemoCmd {

	public static void main(String[] args) {
		
		String str = "";
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			FileWriter fw = new FileWriter("D:\\Demo.txt");
			
			@SuppressWarnings("unused")
			int number;
			System.out.println("Write Here");
			
			while((str = br.readLine())!=null){
				fw.write(str);
				fw.flush();
				
				if(str.equals("")){
					break;
				}
			}
			fw.close();
			System.out.println("Done");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}