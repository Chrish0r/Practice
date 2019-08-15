package ex1;

public class FibonacciIterative {
	
	public static int fib(int n) {

		if(n == 1) {
			return 1;
		}
			
		
		int fibo = 0;
		int last2 = 0;
		int last1 = 1;
		
		for(int i = 1; i < n; i++) {
			fibo = last2 + last1;
			last2 = last1;
			last1 = fibo;
		}
		return fibo;
	}

	public static void main(String[] args) {
		int x = 9;
		
		System.out.println("The fibonacci value of " + x + " is " + fib(x));
	}

}
