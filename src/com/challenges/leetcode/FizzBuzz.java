package com.challenges.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	/*
	 * Given an integer n, return a string array answer (1-indexed) where:
	 * 
	 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5. 
	 * answer[i] == "Fizz" if i is divisible by 3.
	 * answer[i] == "Buzz" if i is divisible by 5. 
	 * answer[i] == i (as a string) if none of the above conditions are true.
	 */
	
	public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            if((i % 3 == 0) && (i % 5 == 0))
                arr.add("FizzBuzz");
            else if(i % 3 == 0)
                arr.add("Fizz");
            else if(i % 5 == 0)
                arr.add("Buzz");
            else
                arr.add(Integer.toString(i));
        }
        
        return arr;
    }
	public static void main(String[] args) {
		

	}
	
}
