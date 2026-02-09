package javaBasics;

abstract class Vehicle{
	public void m1() {
		System.out.println("Vehicle method called...");
	}
	abstract public void m2();
	
}
public class DontDeclareAbstractMethod extends Vehicle {

	public void m1() {
		System.out.println("DDAM method called");
	}
	public void m2() {
		System.out.println("Vehicles abstract method implemented in child");
	}
	
	public static void main(String[] args) {
		DontDeclareAbstractMethod ddam = new DontDeclareAbstractMethod();
		ddam.m1();
		ddam.m2();
		
		Vehicle v = new DontDeclareAbstractMethod();
		v.m1();
		v.m2();
		
		//Overriding, the method resolution is taken care by JVM based on runtime object

	}

}
