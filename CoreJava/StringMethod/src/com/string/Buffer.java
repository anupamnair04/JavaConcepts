//Package Definition
package com.string;
//Super Class Definition
public class Buffer {
	
	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer("Hello ");
		s1.append("All");
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer("JAVA");
		StringBuffer s3 = new StringBuffer("JAVA");
		
		//Shadow Objects
		System.out.println(s2==s3);
		System.out.println(s2.toString().equals(s3.toString()));
		
		//Insert String
		s2.insert(4, "Programming");
		System.out.println(s2);
		
		//Delete String
		s2.delete(2, 4);
		System.out.println(s2);
		
		//Replace String
		s2.replace(2, 4, "JA");
		System.out.println(s2);
	}
}
