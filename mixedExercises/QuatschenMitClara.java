package clara;

import java.util.Locale;
import java.util.Scanner;

public class QuatschenMitClara {

	public static void silblings(int num) {
		Scanner sc = new Scanner(System.in);
		
		if(num > 0) {
			String[] silblingsNames = new String[num];
			
			for(int i = 0; i < silblingsNames.length; i++) {
				System.out.println("Wie heißt dein " + (i+1) + ". Geschwister?");
				// String name = sc.next();
				silblingsNames[i] = sc.next();
			}
			
			if(num == 1) {
				System.out.println("Ah, " + silblingsNames[0] + " ist aber ein schoener Name! Ich hab leider keine Geschwister.");
			} else {
				System.out.print("Ah, ");
				for(int i = 0; i < num - 1; i++) {
				
					if(i < silblingsNames.length - 2) {
						System.out.print(silblingsNames[i] + ", ");
						} else {
						System.out.print(silblingsNames[i] + " und ");
						}
				}
				System.out.println(silblingsNames[num - 1] + " sind aber schoene Namen! Ich hab leider keine Geschwister.");
				}
			} else {
			System.out.println("Ich hab auch keine Geschwister.");
		}
		
		sc.close();
	}
	
	public static void whichCity(String city, String location) {
		Scanner sc = new Scanner(System.in);
		
		if(city.equalsIgnoreCase(location)) {
			System.out.println("Ach in " + location + ", da hast du ja nicht weit hierher.");
		} else {
			System.out.println("Wieviele km ist " + city + " von " + location + " entfernt?");
			
			int distance = sc.nextInt();
			
			if(distance <= 10) {
				System.out.println("Das ist ja nicht weit weg.");
			} 
			else if(distance <= 50) {
				System.out.println("Du musst aber ein bisschen fahren.");
			} else {
				System.out.println("Das ist aber weit weg!");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		sc.useLocale(Locale.US);
		String location = "Regensburg";
		
		System.out.println("Hallo mein Name ist Clara, wie heißt du?");
		String name = sc.next();
		
		System.out.println("Hallo " + name + ", schön dich kennenzulernen. Wo wohnst Du?");
		String city = sc.next();
		
		whichCity(city, location);
		System.out.println();
		
		System.out.println("Ich wohne hier auf Deiner Festplatte: " + System.getProperty("user.dir"));
		System.out.println();
		
		System.out.println("Wieviele Geschwister hast Du?");
		int numberSilblings = sc.nextInt();
		
		silblings(numberSilblings); 
		System.out.println();
		System.out.println("Schön mit Dir zu sprechen, aber ich muss leider gehen, da ich mittlerweile zuviel RAM belege. Bis zum nächsten mal!");
		
		sc.close();
	
	}

}
