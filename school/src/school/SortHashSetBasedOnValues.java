package school;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SortHashSetBasedOnValues {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("Manipur");
		set.add("Zanskar");
		set.add("Delhi");
		set.add("Chandigarh");
		set.add("Telangana");
		
		System.out.println(set);
		
		List<String> list = new LinkedList<>(set);
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
			}
			
		});
		List<String> sortedList = new LinkedList<>();
		for(String l1 : list) {
			sortedList.add(l1);
		}
		System.out.println(sortedList);
		

	}

}
