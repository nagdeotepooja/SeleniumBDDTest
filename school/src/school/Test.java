package school;


import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String s1 = "cat";
		String s2 = "acta";
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(Arrays.equals(c1, c2));

	}

}
