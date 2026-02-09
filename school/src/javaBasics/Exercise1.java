package javaBasics;

public class Exercise1 {

	public static void main(String[] args) {

        int orig = 42;
        
        Exercise1 ex1 = new Exercise1();
        
        int y = ex1.go(orig);
        
        System.out.println(orig+" "+y);

	}
	int go(int arg) {
		arg = arg * 2;
		return arg;
	}

}
