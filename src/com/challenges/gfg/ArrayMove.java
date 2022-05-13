package com.challenges.gfg;

public class ArrayMove {

	public static void main(String[] args) {
		int[] arr = {3,1,5,6,7,2,8,4};
		int source = 3;
		int target = 7;
		
		int temp = arr[source];
		print(arr);
		if(source<target) {
			for(int i=source+1; i<=target; i++) {
				arr[i-1] = arr[i];
			}
		}else {
			for(int i=source-1; i>=target; i--) {
				arr[i+1] = arr[i];
			}
		}
		arr[target] = temp;
		print(arr);
	}

	public static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
