//Package Definition
package seed.array;
//Importing Scanner Class
import java.util.Scanner;
//Driver Code
public class TestStudent1 {
	
 public static void main(String[] args) {
	 //Array Object
	 Student1[] arr = new Student1[2];
	 //Scanner Class
     Scanner sc = new Scanner(System.in);
     //User Input
     for(int i=0;i<arr.length;i++){
       arr[i]=new Student1();
       System.out.println("Enter First Name");
       String fname=sc.next();
    
       System.out.println("Enter Last Name");
       String lname=sc.next();
       arr[i].setFNameAndLName(fname, lname);
     }
     //Calling Print Method User Input
     for(int i=0;i<arr.length;i++){
     System.out.print(arr[i].fName+' '+arr[i].lName);
     }
     //Closing Scanner Class
     sc.close();
 }
}