package school;

import java.util.Stack;

public class BeautifulStringsStack {

	
	static boolean isBeautiful(char x, char y) {
		
		if(x=='1' && y=='0'|| x=='0' && y=='1' ) {
			return true;
		}
		if(x=='0' && y=='0'|| x=='1' && y=='1') {
			return false;
		}
		return false;
	}
	public static int makeBeautiful(String s) {
     
		char[] c = s.toCharArray();
		
		Stack<Character> st = new Stack<Character>();
		
		if(c[0]=='0') {
			c[0] = '1';
		}else {
			c[0] = '0';
		}
		
		int counter = 1;
		
		for(int i=0; i<c.length; i++) {
			if(st.empty()) {
				st.push(c[i]);
			}else{
				if(isBeautiful(st.peek(), c[i])) {
					st.push(c[i]);	
				}else {
					if(st.peek()=='0') {
						st.push('1');
					}
					else if(st.peek()=='1') {
						st.push('0');
					}
					counter++;
				}
			}
				
		}
		System.out.println(st);
		return counter;
	}
	public static void main(String[] args) {
		
		String s = "1010";
		//String s = "100010011011000";
		//String s = "01010010101";   // = 6->>5,  110100000101 = 9->>3,  // 111100000 = 5->>4
	  //	          01010101010                  010101010101              010101010
	  //	          10101010101
		
		int res = makeBeautiful(s);
		
		if(res!=0) {
			System.out.println("In "+res+" operations string could be beautiful string");
		}else {
			System.out.println("Beautiful string");
		}

	}

}
