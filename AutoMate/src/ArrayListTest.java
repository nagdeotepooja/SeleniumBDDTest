import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

	public static void main(String[] args) {
		Integer[] arr1 = {1,3,2,4,5,6,8,7,19};
		Integer[] arr2 = {1,3,2,4,5,6,8,7,9};
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr1));
		Arrays.sort(list1.toArray());
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(arr2));
		//System.out.println(list1.equals(list2));
		
		//list1.removeAll(list2); To find additional element while comparing 2 list
		// list1.retainAll(list2); To find common element while comparing 2 list 
		System.out.println(list1);
		

	}

}
