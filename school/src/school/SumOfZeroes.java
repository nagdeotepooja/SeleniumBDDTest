package school;

public class SumOfZeroes {

	public static void main(String[] args) {
		
		int[][] arr = new int[][]{{1,0},{0,1}};
		
		int count=0;
		for(int i=0; i<2; i++) {
			
			for(int j=0; j<2; j++) {
				if(arr[i][j]==0) {
					if(arr[i][j-1]==1) {  // left <---
						count++;
					}
					if(arr[i-1][j]==1) {  // up ^
						count++;
					}
				}
				if(j<=1) {
					continue;
				}else {
					if(arr[i][j+1]==1) {  // right -->
						count++;
					}
				}
				if(i<=1) {
					continue;
				}else {
					if(arr[i+1][j]==1) { // down 
						count++;
					}
				}
			}
		}
		System.out.println(count);

	}

}
