package com.challenges.gfg;

public class SpiralMatrix {
	
	public static void spiralPrint(int row, int col, int[][] arr) {
		int rowStart = 0;
		int rowEnd = row;
		int colStart = 0;
		int colEnd = col;
		
		while(rowStart < rowEnd && colStart < colEnd) {
		
			for(int i=colStart; i<colEnd; i++) {
				System.out.print(arr[rowStart][i] + " ");
			}
			rowStart++;
			
			for(int i=rowStart; i<rowEnd; i++) {
				System.out.print(arr[i][colEnd-1] + " ");
			}
			colEnd--;
			
			if(rowStart < rowEnd) {
				for(int i=colEnd-1; i>=colStart; i--) {
					System.out.print(arr[rowEnd-1][i] + " ");
				}
				rowEnd--;
			}
			
			if(colStart < colEnd) {
				for(int i=rowEnd-1; i>=rowStart; i--) {
					System.out.print(arr[i][colStart] + " ");
				}
				colStart++;
			}
		}
	}

	public static void main(String[] args) {
		int R = 8;
        int C = 5;
        int a[][] =  {{1, 2, 3, 4,43},
                   {5, 6, 7, 8,56},
                   {9, 10, 11, 12,54},
                   {13, 14, 15, 16,45},
                   {113, 114, 115, 116,145},
                   {213, 214, 215, 216,245},
                   {313, 314, 315, 316,345},
                   {413, 414, 415, 416,445}};
 
        // Function Call
        spiralPrint(R, C, a);

	}

}
