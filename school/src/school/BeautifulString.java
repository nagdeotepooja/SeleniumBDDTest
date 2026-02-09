package school;

import java.util.ArrayList;
import java.util.Arrays;

public class BeautifulString {

	public static void main(String[] args) {

		//String s = "01010010101";
		//String s = "110100000101";
		String s = "111100000";    // Minimum updates to make string as beautiful string

		char[] c = s.toCharArray();

		int n = c.length;

		System.out.println(n);   // 1010  // 0101
		
		
		// generate 2 possibilities >> compare it with original string 

		char[] c1 = generate1(n);
		char[] c2 = generate2(n);

		int count1 = 0;
		int count2 = 0;
		for(int i=0; i<n; i++) {
			if(c[i]!=c1[i]) {
				count1++;
			}
			if(c[i]!=c2[i]) {
				count2++;
			}			
		}
		System.out.println("count-1:"+count1+", count-2:"+count2);
		int Min = Math.min(count1, count2);
		System.out.println("Minimum: "+Min);	
	}

	public static char[] generate1(int n) {

		char[] c = new char[n];
		c[0]='0';
		for(int i=1; i<n; i++) {

			if(c[i-1]=='0') {
				c[i] = '1';	    	
			}else if(c[i-1]=='1') {
				c[i] = '0';	
			}	
		}		
		return c;
	}
	public static char[] generate2(int n) {

		char[] c = new char[n];
		c[0]='1';
		for(int i=1; i<n; i++) {

			if(c[i-1]=='1') {
				c[i] = '0';	    	
			}else if(c[i-1]=='0') {
				c[i] = '1';	
			}	
		}		
		return c;
	}

}
