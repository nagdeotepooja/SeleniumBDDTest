package school;

public class Practice1 {

	int x=10;
	static int y=20;
	public static void main(String[] args) {
		//System.out.println(x);
		System.out.println(y);
		
		/*
		double[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(doubleValues[i][j]+"|");
			}
			System.out.println();
		}
           */
		/*
		String[][] stringValues = new String[][] {{"working", "with"}, {"2D", "arrays"}, {"is", "fun"}};
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(stringValues[i][j]+" ");
			}
			System.out.println();
		}
		*/
		
		String s1 = "jayesh";
		String s2 = s1.toString();
		System.out.println(s2);
	}
	public void m1() {
		System.out.println(x);
		System.out.println(y);
	}

}
