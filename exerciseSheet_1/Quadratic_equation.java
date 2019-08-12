package ex1;

public class Exercise2_quadratic_equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 3;
		double b = 5;
		double c = 1;
		
		double x1, x2;
		
		x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		
		System.out.println("x1 = " + x1 + " and x2 = "  + x2);
	}

}
