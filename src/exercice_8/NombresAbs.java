package exercice_8;

public class NombresAbs {
	public static void main(String[] args) {
		System.out.print("Les nombres absents sont: ");
		int[] tab = { 1, 2, 2, 4, 6 };
		int n = tab.length;

	    for (int i = 1; i <= n; i++) {
	        boolean found = false;
	        
	        for (int j = 0; j < n; j++) {
	            if (tab[j] == i) {
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.print(i + " ");
	        }
	    }
	}
}
