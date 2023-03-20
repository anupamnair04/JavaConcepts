package seed.basicjava;
//Driver Code
public class PrintCalculateArea {
	public static void main(String[] args) {

		int choice=2,r=2,l=4,b=6;
		double pi=3.14;	

		switch(choice){
		case 1:
			System.out.println("Area of Circle:"+ pi*r*r);
			break;
		case 2:
			System.out.println("Area of Rectangle:"+ l*b);
			break;
		case 3:
			System.out.println("Area of Square:"+ l*l);
			break;
		default:
			System.out.println("Invalid Operation");
		}
	}
}
