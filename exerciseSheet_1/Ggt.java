package ex1;

public class Ggt { //kann man auch rekursiv lösen
	
	static int ggt(int x, int y) {
		int i, higher, lower;
		if(x > y) {
			higher = x;
			lower = y;
		} else {
			higher = y;
			lower = x;
		}
		
		for(i = lower; i > 0; i--) {
			if((lower % i == 0) && (higher % i == 0)) {
				break;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 1071;
		int num2 = 1029;
		
		System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is " + ggt(num1, num2));
	}

}
