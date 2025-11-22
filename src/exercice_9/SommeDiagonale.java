package exercice_9;

public class SommeDiagonale {
	public static void main(String[] args) {
		int[][] tab = { { 4, 6, 7 }
						, { 2, 6, 2 }};
		sommeDiagonales(tab);
	}

	public static void sommeDiagonales(int[][] t) {
		int n = t.length;

		int sommePrincipale = 0;
		int sommeSecondaire = 0;

		for (int i = 0; i < n; i++) {
			sommePrincipale += t[i][i];
		}

		System.out.println(sommeSecondaire);
	}

}
