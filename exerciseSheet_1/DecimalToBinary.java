package ex1;

public class DecimalToBinary {
	
	public static void decimalToBinary(int n) {
		int z = n/2;
		int r = n % 2;
		
		if(z != 0) {
			decimalToBinary(z);	
		}
		
		System.out.print(r);
	}

	public static void main(String[] args) {
		int num = 44; // = 101100 in binary
		
		decimalToBinary(num);
	}

}
