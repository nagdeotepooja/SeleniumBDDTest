package javaBasics;

public class ObjectKiller2 {

	Duck1 d = new Duck1();  // Here, Both Instance variable d and object Duck1 sits inside Heap area
	
	public void go(Duck1 w) {
		w = new Duck1();   // Duck reference d is assign to another Duck1 object, making original Duck1 object abandoned.
	}
	
	public static void main(String[] args) {
		ObjectKiller2 ok = new ObjectKiller2();
		ok.go(null);
	}
}
class Duck1{
	Duck1() {
		System.out.println("Duck contructor");
	}
}
