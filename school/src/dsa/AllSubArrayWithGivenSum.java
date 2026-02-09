package dsa;

public class AllSubArrayWithGivenSum {

	public static void main(String[] args) {
		
		//int arr[] = {3,1,2,4};
		int arr[] = {1,2,3,2};
		int n = arr.length;
		int k = 3;
		int count=0;
		int sum = 0;
		int i=0;
		int j=0;
		
		while(j<n) {
			sum = sum + arr[j];
			if(sum == k) {
				count++;
				j++;
			}else if(sum > k) {
				while(sum>k) {
					sum = sum - arr[i];
					if(sum == k) {
						count++;
						j++;
					}else {
						i++;
					}
				}
			}else {
				j++;
			}
		}
		System.out.println("Total subarray with given sum: "+count);

	}

}
