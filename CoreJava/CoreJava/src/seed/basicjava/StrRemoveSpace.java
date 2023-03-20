package seed.basicjava;
//Super Class Definition
public class StrRemoveSpace {
    public static void main(String[] args) {
    	
        String s1 = "Seed Infotech Private Limited";  
        
        //Using built in method  
        String noSpaceStr = s1.replaceAll("\\s", ""); 
        System.out.println(noSpaceStr);  
        
        //Using String Buffer  
        char[] strArray = s1.toCharArray();  
        StringBuffer str = new StringBuffer();  
        for (int i = 0; i < strArray.length; i++) {  
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {  
                str.append(strArray[i]);  
            }  
        }  
        String noSpaceStr2 = str.toString();  
        System.out.println(noSpaceStr2);  
    }  
}  
