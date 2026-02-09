package javaBasics;

public class classVariable {

	private static final double PI = 3.14159;
	private double radius;
	
	public classVariable(double radius){
		this.radius = radius;
	}
	
	public double getArea() {
		return PI*radius*radius;
	}
	
	public static void main(String[] args) {
		classVariable cv1 = new classVariable(5.0);
		System.out.println(cv1.getArea());
		
		classVariable cv2 = new classVariable(7.0);
		System.out.println(cv2.getArea());
	}

}
