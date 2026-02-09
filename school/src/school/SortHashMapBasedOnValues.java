package school;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMapBasedOnValues {

	public static void main(String[] args) {

		boolean ASC = true;
		boolean DESC = false;

		Map<String,String> map = new HashMap<>();
		map.put("Ayesh","Zanskar");
		map.put("Tom","Mumbai");
		map.put("Hari","Punjab");
		map.put("Sree","Kerala");
		map.put("Viks","Orissa");

		System.out.println(map);

		List<Entry<String,String>> list = new LinkedList<>(map.entrySet()); // To store elements in exact order of insertion

		Collections.sort(list, new Comparator<Entry<String,String>>(){

			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {				
				return o1.getValue().compareTo(o2.getValue());				
			}
		});

		Map<String,String> sortedMap = new LinkedHashMap<>();  // TO keep above sorting in exact sorted order
		for(Entry<String,String> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());  
		}
		System.out.println(sortedMap);
	}

}