package exceptionTest;

public class TestSumException {

	
	public static void addition(int a, int b) throws SumException{
		int sum = a + b;
		if(sum<10) {
			throw new SumException("Less than the limit");
		}
		else {
			System.out.println("In correct limit");
		}
		
	}
	public static void main(String[] args) {
		
		try {
			addition(4,5);	
		}
		catch(SumException ex) {
			System.out.println("Caught the exception");
			System.out.println(ex);
		}
		

	}

}
