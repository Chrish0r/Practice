package ex1;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3, y = 5, temp;
		
		System.out.println("Vor Vertasuchen: Der Wert von x = " + x);
		System.out.println("Vor Vertasuchen: Der Wert von y = " + y);
		System.out.printf("\n");
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("Nach Vertasuchen: Der Wert von x = " + x + " und der Wert von y = " + y) ; // x hat nun den Wert 5 und y hat nun Wert 3
	}

}
