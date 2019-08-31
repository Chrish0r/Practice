package kreis;

import java.util.Scanner; //Klasse, also Typ importiert

public class UmfangFlaeche {
	
	public static double umfang(double r) {
		return 2 * Math.PI * r;
	}
	
	public static double flaeche(double r) {
		return r * r * Math.PI;
	}

	public static void main(String[] args) {
		System.out.println("Bitte geben Sie den Radius in Meter ein: ");
		
		Scanner sc = new Scanner(System.in); //Erzeugen von Objekt des Typen Scanners
		double radius = sc.nextDouble();
		
		System.out.println();
		System.out.println("Der Umfang des Kreises betraegt " + umfang(radius) + " m.");
		System.out.println("Die Flaeche des Kreises betraegt " + flaeche(radius) + " m².");
	}

}
