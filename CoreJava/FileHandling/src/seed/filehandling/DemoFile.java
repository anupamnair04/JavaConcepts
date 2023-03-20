//Package Definition
package seed.filehandling;
//Import Java IO Library
import java.io.*;
//Class Definition
public class DemoFile {

	File f;
	String fnm,path,abspath;
	long size;
	
	public DemoFile(String s){
		f = new File(s);
		
		if(f.exists()==true){
			System.out.println("File Exists");
		}else{
			System.out.println("File Does Not Exist");
		}
		
		fnm = f.getName();
		System.out.println("File Name:"+f.getName());
	
		path = f.getPath();
		System.out.println("Path:"+path);
		
		abspath = f.getAbsolutePath();
		System.out.println("Absolute Path:"+abspath);
		
		if(f.canRead()==true){
			System.out.println("Read File");
		}if(f.canWrite()==true){
			System.out.println("Write File");
		}if(f.isAbsolute()==true){
			System.out.println("Absolute Path");
		}
		
		size = f.length();
		System.out.println("File Length:"+size);
	
	}
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		DemoFile DF = new DemoFile("D:\\Demo.txt");

	}
}
