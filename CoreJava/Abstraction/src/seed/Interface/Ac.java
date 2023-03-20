package seed.Interface;
//Sub Class Definition
public class Ac implements Remote{
	
	int Temperature = 10;
	int Battery = 100;

	public int Temperature(){
		if(Temperature > 10){
			Temperature ++;
			System.out.println("Increase Temperature");
		}else if (Temperature < 30){
			Temperature --;
			System.out.println("Decrease Temperature");
		}
		return Temperature;
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
