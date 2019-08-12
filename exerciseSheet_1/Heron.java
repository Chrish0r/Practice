package ex1;

public class Heron {

	public static double root (double a) {
		// TODO Auto-generated method stub
		
		double x = 1.0;
		double oldx;
		
		do {
			oldx = x;
			
			x = 0.5 * (x + a/x); //Do not use 1/2 * ... since int/int == int <- here: 0
		} while(x != oldx);
		
		return x;

	}
	
	public static void main(String[] args) {
		System.out.println(root(2)); // Methode/Fkt. 'root' wird aufgerufen
	}

}
