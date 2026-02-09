package mapset;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		
		
		//String s = "aDcadhc";     // D
		//String s = "AabBcC";        // A
		//String s = "ABcd";        // A
		String str = "AAAbcdb";     // c
		char res = firstNonRepeatingCharacter(str);
		System.out.println(res);
	}
	public static char firstNonRepeatingCharacter(String str) {

		LinkedHashMap<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		char[] c = str.toCharArray();
		int n = c.length;
		
		for(int i=0; i<n; i++) {
			if(!m.containsKey(c[i])) {
				m.put(c[i], 1);
			}else {
				m.put(c[i], m.get(c[i])+1);
			}
		}
		System.out.println(m);
		Set s1 = m.entrySet();
		
		Iterator it = s1.iterator();
		char res='\u0000';
		while(it.hasNext()) {
			
			Map.Entry<Character, Integer> entry = (Map.Entry)it.next();
			
			if(entry.getValue()==1) {
				res = entry.getKey();
				break;
			}
		}
		return res;
	}

}
