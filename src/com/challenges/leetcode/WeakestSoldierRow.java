package com.challenges.leetcode;

import java.util.*;

public class WeakestSoldierRow {
	public int[] kWeakestRows(int[][] mat, int k) {

		int rows = mat.length;
		int cols = mat[1].length;
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
		for(int i=0; i<rows; i++){
			int nos = 0;
			for(int j=0; j<cols; j++){
				if(mat[i][j] == 1)
					nos++;
				else
					break;
			}
			ArrayList<Integer> temp = map.get(nos);
			if(temp != null){
				temp.add(i);
				map.put(nos,temp);
			}else
				map.put(nos,new ArrayList<Integer>(Arrays.asList(i)));

		}
		int[] result = new int[k];  
		int j = 0;
		for(int i=0; i<cols+1; i++){
			ArrayList<Integer> temp = map.get(i);
			if(temp != null){
				for(int d : temp){
					if(j==k)
						return result;
					result[j] = d;
					j++;
				}
			}
		}


		return result;
	}

	public static void main(String[] args) {

	}

}
