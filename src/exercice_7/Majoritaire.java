package exercice_7;

public class Majoritaire {
	public static void main(String[] args) {
		System.out.println("Le nombre majoritaire est: " + majoritaire());
	}

	public static int majoritaire() {
		int[] tab = { 5, 4, 5, 6, 5 };

		int moitierTab = tab.length / 2;
		int numApr = 0;

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab.length; j++) {
				if (tab[j] == tab[i]) {
					numApr++;
				}
			}

			if (numApr > moitierTab) {
				return tab[i];
			}
		}
		return -1;
	}
}
