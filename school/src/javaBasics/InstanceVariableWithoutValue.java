package javaBasics;

public class InstanceVariableWithoutValue {

	private int id;
	private String name;
	private char a;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public char getA() {
		return a;
	}
	public static void main(String[] args) {
		InstanceVariableWithoutValue ivv = new InstanceVariableWithoutValue();
		
		System.out.println(ivv.getId());
		System.out.println(ivv.getName());
		System.out.println(ivv.getA());

	}
}
