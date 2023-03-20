package seed.basicjava;
//Class Definition
public class VarArg {
 public void varArg(int...a){
	 int sum =0;
	 for(int i=0;i<a.length;i++){
		 sum=sum+a[i];
	 }
	 System.out.println("Addition:"+sum);
 }
}
