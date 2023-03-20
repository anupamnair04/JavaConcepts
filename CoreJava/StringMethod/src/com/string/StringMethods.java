//Package Definition
package com.string;
//Driver Code
public class StringMethods {
	
	public static void main(String[] args) {
		
		//Shallow Comparison
		System.out.println("----Equals OR == Method----");
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		String s5 = "Hello";
		String s6 = new String("Hello");
		
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		
		System.out.println("----Concat Method----");
		
		String s7 = "Hello";
		String s8 = s7.concat(s7);
		
		System.out.println(s7);
		System.out.println(s8);
		
		System.out.println("----SubString Method----");
		
		String s9 = ("Welcome to SEED Infotech");
		
		System.out.println(s9.substring(11));
		System.out.println(s9.substring(11,15));
		
		System.out.println("----Split Method----");
		
		String s10 = ("Welcome, to SEED Infotech");
		String arr[]= s10.split(",");
		String arr1[]= s9.split(" ");
		for (String i : arr){
			System.out.println(i);
		}
		for (String i : arr1){
			System.out.println(i);
		}
		
		System.out.println("----UPPER/LOWER Method----");
		
		String s11 = ("welcome to seed infotech");
		System.out.println(s11.toUpperCase());
		
		String s12 = ("WELCOME TO SEED INFOTECH");
		System.out.println(s12.toLowerCase());
	}
}