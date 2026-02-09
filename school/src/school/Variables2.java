package school;

public class Variables2 {

	static int a=10;    //sttic
	
	public void fun() {
	   int b=10;      // local - on second fun call, memory will be destroyed,and new memory will be assigned.
	   System.out.println(a+" "+b);
	   a++; b++;
	   
	}
	public static void main(String[] args) {
		
		Variables2 v = new Variables2();
		v.fun();
		v.fun();

	}

}
