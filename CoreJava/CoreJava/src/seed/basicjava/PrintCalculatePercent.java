package seed.basicjava;
//Driver Code
public class PrintCalculatePercent {
	public static void main(String[] args) {	

		int marks = 33;	

		if(marks<=33){
			System.out.println("Grade:E");
		}else if(marks<=50){
			System.out.println("Grade:D");
		}else if(marks<=60){
			System.out.println("Grade:C");
		}else if(marks<=70){
			System.out.println("Grade:B");
		}else if(marks<=100){
			System.out.println("Grade:A");
		}else{
			System.out.println("Failed");
		}
	}
}
