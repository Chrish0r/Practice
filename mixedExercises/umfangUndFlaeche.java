package rechteck;

import java.util.Scanner;

public class umfangUndFlaeche {
	
	public static double umfang(double l, double b) {
		return 2 * (l + b);
	}
	
	public static double flaeche(double l, double b) {
		return l * b;
	}

	public static void main(String[] args) {
		System.out.print("Bitte geben sie die Laenge des Rechtecks ein: ");
		Scanner sc = new Scanner(System.in);
		
		double laenge = sc.nextDouble();
		
		System.out.print("Nun geben Sie bitte noch die Breite des Rechtecks ein: ");
		
		double breite = sc.nextDouble();
		System.out.println();
		
		System.out.println("Der Umfang des Rechtecks betraegt " + umfang(laenge, breite) + " cm.");
		System.out.println("Die Flaeche des Rechtecks betraegt " + flaeche(laenge, breite) + " cm².");
	}

}
