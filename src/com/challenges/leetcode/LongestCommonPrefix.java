package com.challenges.leetcode;

public class LongestCommonPrefix {
	
	//bestappraoch
	public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1)
            return strs[0];
        int x = 500;
        String word = strs[0];
        for(int i=1; i<strs.length; i++){
            int y = -1;
            String newword = strs[i];
            for(int j=0; j<word.length(); j++){
                if(j<newword.length() && word.charAt(j) == newword.charAt(j)){
                    y++;
                }else{
                    break;
                }
            }
            if(y==-1){
                return "";
            }
            if(x > y)
                x = y;
        }
        return word.substring(0,x+1);
    }
	
	public static String bruteforceappraoch(String[] strs) {
		if(strs.length == 1)
            return strs[0];
        
        String ans = "";
        String word = strs[0];
 
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            boolean flag = false;
            for(int j=1;j<strs.length;j++){
                String newword = strs[j];
                if(i<newword.length() && c == newword.charAt(i)){
                   flag = true;
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag)
                ans=ans+c;
            else
                break;
        }
        return ans;
	}

	public static void main(String[] args) {
		String str = "Chetan";
		System.out.println(str.substring(0, 2));

	}

}
