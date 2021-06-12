package com.hpe.program.practice;

import java.util.HashMap;

public class FindDuplicateFromNumber {


	public static void main(String args[])
	{int rem=0;
		int number =1231236;
		int[] numArray = new int[7];
		for(int i= 0 ; number>0;i++)
			
		{
			rem = number%10;
			number= number/10;
			numArray[i] = rem;
			
			System.out.println(numArray[i]);
		}
		
		HashMap<Integer ,Integer> h = new HashMap<Integer,Integer>();
		for(int a:numArray)
		{
			if(h.containsKey(a))
				
			  h.put(a, h.get(a)+1);
			else
				h.put(a, 1);
		}
		System.out.println(h.keySet());
		System.out.println(h.values());
		
	}
}
