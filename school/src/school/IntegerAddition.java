package school;

public class IntegerAddition {

	public static void main(String[] args) {
		
		int i = 435454;
		int sum=0;
		while(i!=0) {
			int a = i%10;
			i = i/10;
			sum = sum + a;
		}
		System.out.println(sum);

	}

}
