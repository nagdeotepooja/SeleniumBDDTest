package exceptionTest;

public class TestCustomException {

	public static void validateAge(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Age is not valid");
		}
		else {
			System.out.println("Welome to vote");
		}
	}
		
	public static void main(String[] args) {
		
		try {
			validateAge(19);
		} catch (InvalidAgeException e) {
			System.out.println("Caught the exception");
			System.out.println(e);
		}
	}

}
