package downloadRechner;

import java.util.Locale;
import java.util.Scanner;

public class DownloadRechner {
	
	public static double downloadzeit(double speed, double size) {
		speed = speed * 1_000_000; // Umrechnung in bit/s;
		
		size = size * 1024 * 1024 * 8; //Umrechnung in bits
				
		return size/speed;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.println("Wie schnell ist ihr Internet in Mbit/s?");
		
		double speed = sc.nextDouble();
		
		System.out.println("Wie gross ist die Datei in MB, welche sie herunterladen möchten?");
		
		double size = sc.nextDouble();
		System.out.println();
		
		// System.out.println("Sie benoetigen " + downloadzeit(speed, size) + " Sekunden bzw. " + downloadzeit(speed, size) / 60 + " Minuten, um diese Datei herunterzuladen.");
		System.out.printf("Sie benoetigen %.2f Sekunden bzw. %.2f Minuten, um diese Datei herunterzuladen.\n", downloadzeit(speed, size), downloadzeit(speed, size) / 60);
		
		sc.close();

	}

}
