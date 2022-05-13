package com.challenges.leetcode;

public class ReturnMiddleOfLinkedList {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	
	public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode tail = head;
        while(tail !=null && tail.next != null){
            middle = middle.next;
            tail = tail.next.next;
        }
        
        return middle;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
