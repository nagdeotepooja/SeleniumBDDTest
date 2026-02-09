package school;

import java.util.Stack;

public class MinimumParenthesis {

	static boolean isMatching(char x, char y) {
		if(x=='(' && y==')' || x=='{' && y=='}' || x=='[' && y==']') {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		//String s  = "(()))";
		//String s  = ")((()";
		String s = "[][][]][]"; //  // ((()))   (()(()))
		
		char c[] = s.toCharArray();
		
		Stack<Character> st = new Stack<Character>();
		
		
		for(int i=0; i<c.length; i++) {
			if(st.empty()) {
				st.push(c[i]);
			}else {
				if(!isMatching(st.peek(), c[i])) {
					st.push(c[i]);
				}else {
					st.pop();
				}	
			}
			
		}
		if(st.empty()) {
			System.out.println(0);
		}else {
			System.out.println(st.size());
		}
	}

}
