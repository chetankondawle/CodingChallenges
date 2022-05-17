package com.challenges.hackerearth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RapidTyping {

	public static void main(String[] args) {
		String str = "YLrJpXOygVUl6MqBIRFWuAKsH7Gw4Z8";
		
		HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
		String[] arr = str.split("");
		for(int i=0; i<arr.length; i++) {
			ArrayList<Integer> cord = new ArrayList<>();
			cord.add(0);cord.add(i);
			map.put(arr[i].charAt(0), cord);
		}
		str = "kE0tTQdP1CcxSjamizon9e5NfvDbh32";
		arr = str.split("");
		for(int i=0; i<arr.length; i++) {
			ArrayList<Integer> cord = new ArrayList<>();
			cord.add(1);cord.add(i);
			map.put(arr[i].charAt(0), cord);
		}
		
		String query = "YE0";
		
		int distance = 0;
		ArrayList<Integer> fcord = new ArrayList<>();
		fcord.add(0);fcord.add(0);
		
		arr = query.split("");
		for(int i = 0; i<arr.length; i++) {
			char c= arr[i].charAt(0);
			ArrayList<Integer> scord = map.get(c);
			if(scord == null) {
				System.out.println(-1);
				return;
			}
			int dis = Math.abs(scord.get(0) - fcord.get(0)) + Math.abs(scord.get(1) - fcord.get(1));
			distance = distance + dis;
			fcord = scord;
		}
		System.out.println(distance);

	}

}
