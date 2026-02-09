package mapset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SortOnKey {

	public static void main(String[] args) {
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		
		/*
		 * map1.put("3", "three"); map1.put("1", "one"); map1.put("4", "four");
		 * map1.put("2", "two");
		 */
		
		map1.put("three",3);
		map1.put("one",1);
		map1.put("four",4);
		map1.put("two",2);
		
		System.out.println(map1);
		
		ArrayList<String> list = new ArrayList<String>(map1.keySet());
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println(map1);

	}

}
