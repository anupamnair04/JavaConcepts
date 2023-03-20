//Package Definition
package seed.collection;
//Import Priority Queue Class
import java.util.PriorityQueue;
//Import Scanner Class
import java.util.Scanner;
//Driver Code
public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue<Integer> num = new PriorityQueue<Integer>();
		//User Input
		System.out.println("Enter 3 numbers");
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<3;i++){
			num.add(sc.nextInt());
		}
		//Enhanced for loop to print number
		System.out.println("All Numbers Are:");
		for(Integer n:num){
			System.out.println(n);
		}
		System.out.println("Head is accessed with peak:"+num.peek());
		System.out.println(num);
		System.out.println("Head is accessed and removed with poll:"+num.poll());
		System.out.println(num);
		//Scanner Close
		sc.close();
		
		PriorityQueue<String> color = new PriorityQueue<String>();
		//User Input
		System.out.println("Enter 3 colors");
		Scanner scc = new Scanner(System.in);
		for(int i = 0;i<3;i++){
			color.add(scc.next());
		}
		//Enhanced for loop to print number
		System.out.println("All Colors Are:");
		for(String c:color){
			System.out.println(c);
		}
		System.out.println("Head is accessed with peak:"+color.peek());
		System.out.println(color);
		System.out.println("Head is accessed and removed with poll:"+color.poll());
		System.out.println(color);
		//Scanner Close
		scc.close();
	}
}