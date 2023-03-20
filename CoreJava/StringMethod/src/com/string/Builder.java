//Package Definition
package com.string;
//Super Class Definition
public class Builder {
	
	public static void main(String[] args) {
		
		StringBuilder s1 = new StringBuilder("Hi ");
		s1.append("Everyone");
		System.out.println(s1);
		
		StringBuilder s2 = new StringBuilder("C++");
		StringBuilder s3 = new StringBuilder("C++");
		
		//Shallow Comparison
		System.out.println(s2==s3);
		System.out.println(s2.toString().equals(s3.toString()));
		
		//Insert String
		s2.insert(3, "Programming");
		System.out.println(s2);
		
		//Delete String
		s2.delete(1, 3);
		System.out.println(s2);
		
		//Replace String
		s2.replace(1, 3, "CC");
		System.out.println(s2);
	}
}
