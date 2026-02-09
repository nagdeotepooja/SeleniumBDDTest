package exceptionTest;

public class TestMyException {

	
	public static void main(String[] args) {
		
		try {
			throw new MyExceptionClass();
		} catch (MyExceptionClass e) {
			System.out.println("Caught the exception");
			System.out.println(e.getMessage());
		}

	}

}
