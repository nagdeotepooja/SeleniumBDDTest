package javaBasics;

public class ObjectKiller3 {

	Duck2 d = new Duck2();  // Here, Both Instance variable d and object Duck2 sits inside Heap area
	
	public void go() {
		d = null;   // Duck reference d is assigned as null, making original Duck1 object abandoned.
		System.out.println(d.hashCode());
	}
	
	public static void main(String[] args) {
		ObjectKiller3 ok = new ObjectKiller3();
		ok.go();
	}
}
class Duck2{
	Duck2() {
		System.out.println("Duck contructor");
	}
}
