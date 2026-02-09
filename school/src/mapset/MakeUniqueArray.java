package mapset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MakeUniqueArray {

	public static void main(String[] args) {
		
		//HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		//int[] arr = {1,2,1,2};
		//int[] arr = {3,6,7,12,13};
		//int[] arr = {1,1,1,1};
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,1,2));
		int res = minElementsToRemove(arr);
		System.out.println(res);
	}
	
	public static int minElementsToRemove(ArrayList<Integer> arr) {
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		int n=arr.size();
		int count=0;
		for(int i=0; i<n; i++)
		{
			if(!m.containsKey(arr.get(i))) {
				m.put(arr.get(i), 1);
			}else {
				count++;
			}
		}
		return count;
	} 

}
