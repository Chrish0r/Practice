package ex1;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j; 
		boolean is_prim;
		
		/* System.out.println(2); <- nicht notwendig, 
		falls man als Abbruchbedinung bzgl. Teiler Wurzel aus i verwendet, anstatt i/2. */
		
		for(i = 2; i <= 1000; i++) {
			is_prim = true;
			for(j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					is_prim = false;
					break;
				}						
			}
			if(is_prim) {
				System.out.println(i);
			}
		}

	}

}
