package dsa;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateElement {

	public static void main(String[] args) {
		
         String str = "measuremental";
         
         char[] ch = str.toCharArray();
         HashSet<Character> set = new HashSet<>();
         ArrayList<Character> list = new ArrayList<>();
         for(int i=0; i<ch.length; i++) {
        	if(set.contains(ch[i])) {
        		list.add(ch[i]);
        	}else {
        		set.add(ch[i]);
        	}
         }
         
         System.out.println(set);
         System.out.println(new HashSet<>(list));
         
        
         
         
         
         

	}

}
