package com.hpe.program.practice;

import java.util.HashMap;

public class FindDuplicateFromString {

	public static void main(String args[])
	{int i =0;
		System.out.println("Hello it's Bhagyashree");
		String str = "Bhagyashree";
		char[] c = str.toCharArray();
		
		
		HashMap<Character , Integer> h = new HashMap<Character , Integer>();
		for(char a:c)
		{if (h.containsKey(a))
			
		{ i = h.get(a);
		System.out.println(h.get(a));
			h.put(a, i+1);
		}
		else
			h.put(a, 1);
	
			
		}
		System.out.println(h.keySet());
		System.out.println(h.values());
	
	}
}
