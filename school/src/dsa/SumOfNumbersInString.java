package dsa;

public class SumOfNumbersInString {

	public static void main(String[] args) {
		
		String str = "Tu4f30te93r7";
		
		int sum = 0;
		
		for(char ch : str.toCharArray()) {
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}

		System.out.println(sum);
	}

}
