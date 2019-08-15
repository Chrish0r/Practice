package ex1;

public class FibonacciRekursive {
	
	public static int fib(int n) {
		
		if(n == 0 || n == 1) {
			return n;
		} 
		
		return fib(n - 1) + fib(n - 2);
		
	}
	
	public static void main(String[] args) {
		int num = 9;
		
		System.out.println("The fibonacci value of the number " + num + " is " + fib(num));
	}

}
