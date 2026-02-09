package school;

public class SecondHighestInArray {

	public static void main(String[] args) {
		
		int arr[] = {8,4,2,1,6,5,7,3,26};
		int k=2;
		int max2=0;
		for(int i=0; i<k; i++) {
			int max = arr[0];
			int s = 0;
			for(int j=0; j<arr.length; j++) {
				if(arr[j] >= max) {
					max = arr[j];
					s = j;
					max2 = max;
				}
			}
			arr[s]=0;
		}
		System.out.println(max2);

	}

}
