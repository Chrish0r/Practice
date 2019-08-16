package ex1;

public class PascalTriangle {
	
	public static int pascal(int z, int s) {
		if (z < 0 && s < 0) return 1;
		if (z < 0 || s < 0) return 0;
		return pascal(z-1, s-1) + pascal(z-1, s);
	}

	public static void main(String[] args) {
		int rows = 6; // ToDo: Zuerst PascalDreieck in Main zeichnen mittels nested forLoop (argumente and pascal() dann z und s;
		int i, j;
		
		for(i = 0; i < rows; i++) {
			for(j = 0; j < (rows - i - 1); j++) {
				System.out.printf("%4s", "");
			}

			for(j = 0; j < i + 1; j++) {
				System.out.printf("%8d", pascal(i,j));
			}
			System.out.println();
		}
		
	}

}
