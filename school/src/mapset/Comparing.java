package mapset;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Comparing{

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		
		list1.add(3);
		list1.add(4);
		list1.add(15);
		list1.add(8);
		list1.add(9);
		list1.add(10);
		
		List<Integer> list2 = list1.stream().collect(Collectors.toList());
		
		//System.out.println(list2.stream().collect(Collectors.summingInt(0)));
			

	}

	

	

}
