package com.challenges.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindomeInLinkedList {
	/*
	 * public static boolean isPalindrome(ListNode head) { int shadowMarker = -1;
	 * ListNode travelNode = head; ArrayList<Integer> arr = new ArrayList<>();
	 * 
	 * if(head.next == null) return true;
	 * 
	 * while(travelNode.next != null){ if((shadowMarker>=0) &&
	 * ((arr.get(shadowMarker) == travelNode.val) && (travelNode.val !=
	 * travelNode.next.val) )){ shadowMarker--; if((shadowMarker>=0) &&
	 * arr.get(shadowMarker) == travelNode.val){ shadowMarker--; } }else
	 * if((shadowMarker>=1) && (arr.get(shadowMarker-1) == travelNode.val)){
	 * shadowMarker--; shadowMarker--; }else if(shadowMarker < arr.size()-1){
	 * shadowMarker = arr.size()-1; shadowMarker++; }else{ shadowMarker++; }
	 * arr.add(travelNode.val); travelNode = travelNode.next; }
	 * 
	 * if(shadowMarker < arr.size()-1 && (shadowMarker>=0) && (arr.get(shadowMarker)
	 * != travelNode.val)){ shadowMarker = arr.size()-1; }else if((shadowMarker>=0)
	 * && (arr.get(shadowMarker) == travelNode.val)){ shadowMarker--;
	 * arr.add(travelNode.val); if(arr.size()%2 == 0 && (shadowMarker>=0) &&
	 * arr.get(shadowMarker) == travelNode.val){ shadowMarker--; } }else
	 * if((shadowMarker>=1) && (arr.get(shadowMarker-1) == travelNode.val)){
	 * shadowMarker--; shadowMarker--; }else{ shadowMarker = arr.size()-1; }
	 * 
	 * boolean flag = shadowMarker == -1 ? true : false; return flag; }
	 */
	 public static boolean isPalindrome(ListNode head) {
	        ListNode mid = head;
	        ListNode tail = head;
	        while(tail != null && tail.next != null){
	            mid = mid.next;
	            tail = tail.next.next;
	        }
	        
	        ListNode rev = null;
	        while(head != mid){
	            ListNode nextnode = head.next;
	            head.next = rev;
	            rev = head;
	            head = nextnode;
	        }
	        
	        if(tail != null)
	            mid = mid.next;
	        
	        while(rev != null && mid != null){
	            if(rev.val != mid.val)
	                return false;
	            rev = rev.next;
	            mid = mid.next;
	        }
	        
	        return rev == null && mid == null;
	    }
	    
	    public static void main(String[] args) {
	    	LinkedList ll = new LinkedList(8);
	    	int[] arr = {0,7,1,7,7,9,7,5,2,9,1,7,3,7,0,6,5,1,7,7,9,3,8,1,5,7,7,8,4,0,9,3,7,3,4,5,7,4,8,8,5,8,9,8,5,8,8,4,7,5,4,3,7,3,9,0,4,8,7,7,5,1,8,3,9,7,7,1,5,6,0,7,3,7,1,9,2,5,7,9,7,7,1,7,0,8};
	    	for(int i=0; i<arr.length; i++) {
	    		ll.addNode(arr[i]);
	    	}
	    	
	    	isPalindrome(ll.head);
	    	
	    }
	
}

class LinkedList{
	ListNode head;
	int[] arr;
	LinkedList(int val){
		head = new ListNode(val);
		arr = new int[] {8,0,7,1,7,7,9,7,5,2,9,1,7,3,7,0,6,5,1,7,7,9,3,8,1,5,7,7,8,4,0,9,3,7,3,4,5,7,4,8,8,5,8,9,8,5,8,8,4,7,5,4,3,7,3,9,0,4,8,7,7,5,1,8,3,9,7,7,1,5,6,0,7,3,7,1,9,2,5,7,9,7,7,1,7,0,8};
	}
	public void addNode(int val) {
		ListNode temp = head;
		ListNode newnode = new ListNode(val);
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newnode;
	}
	@Override
	public String toString() {
		return "LinkedList [arr=" + Arrays.toString(arr) + "]";
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
