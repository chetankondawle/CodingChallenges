package com.challenges.leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class RomanToInteger {
	
	public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);
        int result = 0;
        for(int i=0; i<s.length(); i++){
            int value = romanMap.get(s.charAt(i));
            char prev = i==0? 'T' : s.charAt(i-1);
            char curr = s.charAt(i);
            
            if((curr == 'X' || curr == 'V') && prev == 'I'){
                value = curr == 'V' ? 3 : 8;
            }else if((curr == 'L' || curr == 'C') && prev == 'X'){
                value = curr == 'L' ? 30 : 80;
            }else if((curr == 'D' || curr == 'M') && prev == 'C'){
                value = curr == 'D' ? 300 : 800;
            }
            
            result = result + value;
        }
        return result;
    }

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		System.out.println(a.size());
	}

}
