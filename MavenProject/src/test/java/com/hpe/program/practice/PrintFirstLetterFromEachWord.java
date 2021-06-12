package com.hpe.program.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintFirstLetterFromEachWord {
	public static void main(String args[]) {
		System.out.println("Please enter complete sentence : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		//ArrayList ar = new ArrayList<String>();
		String[] words =str.split("\\s+");
		
		for(int i= 0 ;i<words.length ;i ++) {
			
		System.out.println(words[i].charAt(0));
	}
	}
}
