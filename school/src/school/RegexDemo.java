package school;

public class RegexDemo {

	public static void main(String[] args) {
		String str = "dswqe45l@sw$!0.9W";
		
		System.out.println(str.replaceAll("[a-z0-9]", ""));
		System.out.println(str.replaceAll("[^a-z0-9]", ""));
		//System.out.println(str.replaceAll("\\D", ""));
		
		String numeric = str.replaceAll("\\D", "");
		System.out.println(numeric);
		
		char[] ch = numeric.toCharArray();
		int sum = 0;
		for(int i=0; i<ch.length; i++) {
			sum = sum + Character.getNumericValue(ch[i]);
		}
		System.out.println(sum);
	}

}
