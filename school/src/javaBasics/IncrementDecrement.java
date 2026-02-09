package javaBasics;

public class IncrementDecrement {

	public static void main(String[] args) {
		 int i=1, j=2, k=3;
		 //int m = i-- - j-- - k--;
		 System.out.println("i="+i);
		 System.out.println("j="+j);
		 System.out.println("k="+k);
		// System.out.println("m="+m);

		 
		 
		/* Here's how m is calculated step by step:

		 Post-decrement behavior: The i--, j--, and k-- operators are post-decrement operators. This means the value of the variable is used in the expression first, and then the variable is decremented afterward.

		 Step-by-step evaluation:

		 First, the value of i (which is 1) is used, and then i is decremented to 0.
		 Then, the value of j (which is 2) is used, and then j is decremented to 1.
		 Finally, the value of k (which is 3) is used, and then k is decremented to 2.
		 Calculation: The expression becomes:

		 makefile
		 Copy code
		 m = (i--) - (j--) - (k--)
		 m = 1 - 2 - 3
		 m = -4 */
		 
		 int m = 0, n = 0;
		 int p = --m * --n * n-- * m--;
		 System.out.println(p);
		 
		 int ch = 'A';
		 System.out.println(ch++);
	}

}
