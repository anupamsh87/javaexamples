package com.programs;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String newString = "anupam";
		String x = "anupam";
		System.out.println(newString==x); //true
		
		String a = new String("anupam");
		System.out.println(x==a); //false
		
		
		String u = new String("anupam"); //Immutable object
		System.out.println(u.hashCode());
		u = u.concat("sharma");
		System.out.println(u.hashCode());
		
		
		StringBuffer xyz = new StringBuffer("anupam");
		System.out.println(xyz.hashCode());
		xyz.append("anupam");
		System.out.println(xyz.hashCode()); //Same hascode is returned
		
		StringBuilder abc = new StringBuilder("anupam");
		abc.append("anupam");
		//StringBuffer is synchronized, StringBuilder is not.

	}

}
