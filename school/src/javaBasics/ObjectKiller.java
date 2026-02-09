package javaBasics;

public class ObjectKiller {

	
	public void foof() {
		barf();
	}
	
	public void barf() {
		Duck d= new Duck();
		System.out.println(d.getClass().getName());
	}
	public static void main(String[] args) {
		ObjectKiller ok = new ObjectKiller();
		ok.foof();
		//ok.barf();

	}

}

class Duck{
	Duck() {
		System.out.println("Duck contructor");
	}
}
