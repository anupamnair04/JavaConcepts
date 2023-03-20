package seed.Interface;
//Sub Class Definition
public class Television implements Remote {
    
	int Volume = 10;
	int Battery = 49;
	
	@Override
	public int Volume() {
		if(Volume > 10){
			Volume ++;
			System.out.println("Increase Volume");
		}else if (Volume < 30){
			Volume --;
			System.out.println("Decrease Volume");
		}
		return Volume;
	}
	@Override
	public int Battery() {
		if(Battery == 100){
			System.out.println("Full Capacity");
		}else if (Battery <=50){
			System.out.println("50% Capacity Remaining");
		}else if (Battery <=20){
			System.out.println("Please Recharge Your Battery");
		}
		return Battery;
	}	
}
