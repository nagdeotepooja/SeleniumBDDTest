package javaBasics;

public class instanceVariable {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
         instanceVariable iv1 = new instanceVariable();
         iv1.setName("John");
         System.out.println("My name is "+iv1.getName());
         instanceVariable iv2 = new instanceVariable();
         iv2.setName("Mike");
         System.out.println("My name is "+iv2.getName());
         instanceVariable iv3 = new instanceVariable();
         iv3.setName("Nice");
         System.out.println("My name is "+iv3.getName());
	}
	

}
