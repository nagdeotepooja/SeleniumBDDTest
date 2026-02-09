package school;

import java.util.Scanner;

public class Demo2DArray {

	public static void main(String[] args) {
		
		int row = 4;
		int col = 4;
		
		int arr[][] = new int[row][col];
		int value=1;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
			    arr[i][j] = i*j;
			    //value++;
			}
		}
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
        
	}

}
