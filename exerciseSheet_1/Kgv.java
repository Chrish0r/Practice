package ex1;

public class Kgv {
	
	static void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
	}
	
	static int kgv(int x, int y) {
		int i, j;
		int smc = 0; // smc stands for smallest common multiple
		
		if(x > y) {
			swap(x, y);
		}
		
		if(y % x == 0) {
			smc = 1;
		}
		
		for(i = 2; i <= x; i++) {
			for(j = 2; j <= y; j++) {
				if((i * y) == (j * x)) {
					
					break;
				}
			}
			smc = j * y;
			break;
		}
		return smc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 21;
		int num2 = 6;
		
		System.out.println("The smallest common multiple of " + num1 + " and " + num2 + " is " + kgv(num1, num2));

	}

}
