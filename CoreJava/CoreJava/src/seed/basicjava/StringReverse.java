package seed.basicjava;
public class StringReverse {
	
	//Method to reverse a string in Java using recursion
      private static String reverse(String str){
    //Base Case: if the string is null or empty
      if (str == null || str.equals("")){
      return str;
      }
    //Last character + recur for the remaining string
      return str.charAt(str.length()-1)+reverse(str.substring(0,str.length()-1));
      }
      
    //Method to reverse a string in Java using a character array
      public static String reversee(String str){
    //Return if the string is null or empty
      if (str == null || str.equals("")){
    	  return str;
      }
    //Create a character array and initialize it with the given string
      char[] c = str.toCharArray(); 
        for (int l = 0, h = str.length() - 1; l < h; l++, h--){
        //Swap values at `l` and `h`
         char temp = c[l];
            c[l] = c[h];
            c[h] = temp;
        } 
    //Convert character array to string and return
      return String.copyValueOf(c);
      }
      
	public static void main(String[] args) {

		//ReverseString using CharcterArray.
		  //Declaring variable
		    String s1 = "SEED";
		  //Convert String to character array by using toCharArray
		    char[] result = s1.toCharArray();
		  //Iteration
		    for(int i=result.length-1;i>=0;i--){
		       System.out.print(result[i]);
		    }
		
		//Reverse String using StringBuilder.
		  //Declaring variable
		    String s2 = "INFOTECH";
          //Creating StringBuilder Object
		    StringBuilder s3 = new StringBuilder();
		  //Append a string into StringBuilder stringBuildervarible
            s3.append(s2);
	      //Reverse is inbuilt method in StringBuilder to use reverse the string 
		    s3.reverse();
          //Print reversed String
            System.out.println("\n"+s3);
        
        //Convert String to StringBuffer and reverse of string
            String s4 = "JAVA";
          //Conversion from String object to StringBuffer
            StringBuffer s5 = new StringBuffer(s4);
          //To reverse the string
            s5.reverse();
            System.out.println(s5);
        
        //Method to reverse a string in Java using recursion
            String s6 = "C++";
          //String is immutable
            s6 = reverse(s6);
            System.out.println(s6);
            
        //Method to reverse a string in Java using a character array
            String s7 = "ORACLE";
          //String is immutable
            s7 = reverse(s7);
            System.out.println(s7);
     }		
}
