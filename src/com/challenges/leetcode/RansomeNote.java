package com.challenges.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RansomeNote {
	
	public boolean canConstruct(String ransomNote, String magazine) {

        int j = 0;
        Map<Character,Integer> arr = new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            Integer count = arr.get(magazine.charAt(i));
            if(count == null)
                arr.put(magazine.charAt(i),1);
            else
                arr.put(magazine.charAt(i),count+1);
        }
        
        for(int i=0; i<ransomNote.length(); i++){
            Integer count = arr.get(ransomNote.charAt(i));
            if(count == null)
                return false;
            else if(count == 0){
                return false;
            }else{
                arr.put(ransomNote.charAt(i),count-1);
            }
        }
        
        return true;
    }

	public static void main(String[] args) {
		Set<Character> arr = new HashSet<>();
		arr.add('C');
		for(char i : arr) {
			
		}
	}

}
