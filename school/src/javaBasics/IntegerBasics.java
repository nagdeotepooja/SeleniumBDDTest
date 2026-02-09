package javaBasics;

public class IntegerBasics {

	Float i;
	int j;
	Integer x;
	Boolean b;
	double d = 42.5;
	
	public static void main(String[] args) {
		
		IntegerBasics ib = new IntegerBasics();
		String s = "true";
		boolean b = Boolean.parseBoolean(s);
		System.out.println(b);
		
		double d = 42.5;
		String doubleString = "" + d; 
		String v = doubleString;
		System.out.println(v);
		String doubleString2 = Double.toString(d);
		System.out.println(doubleString2);
		
		ib.go();

	}
	
	public void go() {
		//j=i;
	
		System.out.println(i);
		System.out.println(b);
		
	}

}
