package school;

public class DataHiding {

	public static void main(String[] args) {
		
		DataHiding d= new DataHiding();
		double res = d.getBalance();
        System.out.println(res);
	}

	private double balance=10000.0;
	
	public double getBalance() {
		return balance;
	}
}
