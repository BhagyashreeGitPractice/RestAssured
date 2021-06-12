package com.hpe.program.practice;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String args[]) {
		System.out.println("Please enter number to be reversed : "+"\n");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int rem,rev =0;
		int original = num;
		//123
		//num 12 rem 3
		//1 2
		while(num>0)
		{
			
			rem= num%10 ;
			num=num/10;
			rev = rev*10 + rem;
			
			
		}
		System.out.println("Reverse number is :"+rev);
		if(original == rev)
		{
			System.out.println("Number is Pallindrome");
		}
		else
			System.out.println("Number is non Pallindrome");
	}

}
