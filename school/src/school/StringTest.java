package school;

public class StringTest {

	
	public static void main(String[] args) {
		

		String word = "addietion";
		String vowels = "AEIOUaeiou";
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<word.length(); i++) {
			if(vowels.indexOf(word.charAt(i)) > -1) {
				sb.append(word.charAt(i));
			}
		}
		System.out.println(sb);
	}

}
