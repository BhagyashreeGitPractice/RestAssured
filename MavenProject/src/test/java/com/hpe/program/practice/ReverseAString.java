package com.hpe.program.practice;

import java.util.Stack;

public class ReverseAString {
	
	public static void main(String args[]) {
		//Normal Method
		String a="Ashwin";
		char[] c = a.toCharArray();
		/*
		 * for(int i =a.length()-1 ;i>=0 ; i--) { System.out.println(c[i]); }
		 */
		
		
		//Using Stack Method
		int length = c.length;
		
		Stack stack = new Stack();
		for(int j = 0;j<length;j++) {
			stack.push(c[j]);
		}
		
		for(int k = 0;k<length;k++) {
			c[k]= (Character) stack.pop();
			System.out.println("eversed STring is "  + c[k]);
			
		}
		
	}

}
