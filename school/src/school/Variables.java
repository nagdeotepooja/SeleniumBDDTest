package school;

public class Variables {

	static int c=30;  // static
	int b=20; // Instance
	public static void main(String[] args) {
		
		int a=10;  // Local 
		Variables v = new Variables();
		System.out.println(a);
		System.out.println(v.b);
		System.out.println(Variables.c);
		v.fun();

	}
	void fun() {
		System.out.println(b);
	}

}
