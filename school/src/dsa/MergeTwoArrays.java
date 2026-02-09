package dsa;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrays {

	public static void main(String[] args) {
		
		int[] a = {90,30};
		int[] b = {50,60,70,80};
		
		int[] res = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
		Arrays.sort(res);
		System.out.println(Arrays.toString(res));

	}

}
