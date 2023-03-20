//Package Definition
package seed.constructor;
//Class Definition
public class Account {
	
	//Instance Variables
	int acc_num;
	String acc_holNm;
	double bal;
	//Constructor Method without parameters
	public Account(){
		acc_num=180380;
		acc_holNm="Ms. Shikha Shrivastava";
		bal=200000;
	}
	//Constructor Method with parameters using this Keyword
	public Account(int acc_num,String acc_holNm,double bal){
		this.acc_num=acc_num;
		this.acc_holNm=acc_holNm;
		this.bal=bal;	
	}
	//Print Method
	public void printAccount(){
		System.out.println("Account DETAILS"+" "+acc_num+" "+acc_holNm+" "+bal);
	}
}
