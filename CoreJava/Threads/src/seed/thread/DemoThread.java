//Package Definition
package seed.thread;
//Class Definition
public class DemoThread extends Thread{

	Thread t1,t2;
	String s;
	
	DemoThread(String s){
		this.s=s;
	}
	public void run(){
		for(int i=0;i<5;i++){
			try{
				Thread.sleep(3000);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		
		DemoThread t1 = new DemoThread("Ram");
		DemoThread t2 = new DemoThread("Radha");
		
		t1.start();
		t2.start();
		
		System.out.println(t1);
		System.out.println(t2);

	}
}
