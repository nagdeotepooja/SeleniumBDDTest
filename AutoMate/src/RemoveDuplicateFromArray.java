import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(9,1,1,2,2,4,6,7,2,3,5,4,3,8,2,8));
		System.out.println(alist);
		LinkedHashSet<Integer> set = new LinkedHashSet<>(alist);
		System.out.println(set);
		ArrayList<Integer> list = new ArrayList<>(set);
		
		System.out.println(list);
		
		ArrayList<Integer> alist1 = new ArrayList<>(Arrays.asList(9,8,2,2,4,6,7,2,3,5,4,3,8,2,8,1));
		List<Integer> l = alist1.stream().distinct().collect(Collectors.toList());
		Collections.sort(l);
		System.out.println(l);
		
		String str = "today is my birthday is birthday";
		System.out.println(str.lastIndexOf(""));
		String[] s = str.split(" ");
		//Arrays.asList(s);
		//Arrays.asList("Today","is", "my", "birthday", "is", "birthday")
		ArrayList<String> alist2 = new ArrayList<>(Arrays.asList(s));
		List<String> l2 = alist2.stream().distinct().sorted().collect(Collectors.toList());
		//Collections.sort(l2);
		System.out.println(l2);
		
		
		
		

	}

}
