package ex1;

public class PrimNumbersExtended {
	
	public static int getNextprim(int i) {
		boolean is_prim;
		
		for( ; i <= 1000; i++) {
			is_prim = true;
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					is_prim = false;
					break;
				}						
			}
			if(is_prim == true) { // or simply if(is_prim)
				return i;
			}
		}
		return 0; // no further prim numbers found
	}

	public static void main(String[] args) {
		
		int n = 0;
		int i;

		int array[] = new int [500];
		
		for(i = 2; i < 1000; i++) {
			i = getNextprim(i);
			if(i != 0) {
				array[n] = i;
				n++;
			} else {
				break;
			}
		}
		System.out.print("[");
		for(i = 0; i < n-1; i++) {
			System.out.print(array[i] + ", ");
		}
		
		System.out.println(array[i] + "]");
	}
}


