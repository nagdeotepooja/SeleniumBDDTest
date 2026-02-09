package mapset;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		
		String[] str = {"eat","tea","tan","ate","nat","bat"};
		
		List list = Arrays.asList(str);
		Map<Character, Integer> map = new HashMap();
		for(int i=0; i<list.size(); i++) {
			String s = list.get(i).toString();
			char[] ch = s.toCharArray();
			int n = ch.length;
			for(int j=0; j<n; j++) {
				if(!map.containsKey(ch[j])) {
					map.put(ch[j], 1);
				}else {
					map.put(ch[j], map.get(ch[j])+1);
				}
			}
			
		}
	}

}
