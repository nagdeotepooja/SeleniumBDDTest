package mapset;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceAnagrams {

	public static void main(String[] args) {
		
		Map<Character,Integer> map = new HashMap<>();
		String txt = "aabaabaa";//"forxxorfxdofr";
		char[] ct = txt.toCharArray();
		int n = ct.length;
		String ptr = "aaba";//"for"; //
		char[] cp = ptr.toCharArray();
		int k = cp.length;
		for(int x=0; x<cp.length; x++) {
			if(!map.containsKey(cp[x])) {
				map.put(cp[x], 1);
			}else {
				map.put(cp[x], map.get(cp[x])+1);
			}
		}
		//System.out.println(map.size());
		int i=0;
		int j=0;
		int count=map.size();
		int ans = 0;
		while(j<n) {
			if(map.containsKey(ct[j])){
				map.put(ct[j], map.get(ct[j])-1);
				if(map.get(ct[j])==0) {
					count--;
				}
				if((j-i+1)==k) {
					if(count==0) {
						ans++;
						if(map.containsKey(ct[i])){
					        map.put(ct[i], map.get(ct[i])+1);
					        if(map.get(ct[i])>0) {
								count++;
							}
					        i++;
							j++;
						}else {
							continue;
						}
					}else if(count>0){
						i++;
						j++;
					}
				}else {
					j++;
				}
			}else {
				if(map.containsKey(ct[i])){
			        map.put(ct[i], map.get(ct[i])+1);
			        if(map.get(ct[i])>0) {
						count++;
					}
				i++;
				j++;
				}
			}
			
		}
		System.out.println(ans);

	}

}
