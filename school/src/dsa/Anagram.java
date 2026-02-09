package dsa;

import java.util.Arrays;
import java.util.Collections;

public class Anagram {

	public static void main(String[] args) {

		
		String s1 = "geeks";
		String s2 = "eeksg";
		
	    char[] ch1 = s1.toCharArray();
	    char[] ch2 = s2.toCharArray();
	    
	    Arrays.sort(ch1);
	    Arrays.sort(ch2);
	    
	    System.out.println(Arrays.equals(ch1, ch2));

	}

}
