package ex1;

public class CrossSum {
	
	static int crossSum(int n) {
		int sum = 0;
		
		while(n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num = 5234; // cross sum is 14
		
		System.out.println("The cross sum of the number " + num + " is " + crossSum(num));
	}

}
