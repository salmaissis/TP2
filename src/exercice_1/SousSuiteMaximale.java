package exercice_1;

import java.util.Arrays;
import java.util.Scanner;

public class SousSuiteMaximale {
	public static void main(String[] args) {
		int[] numTab;
		int longueur;
		Scanner sc = new Scanner(System.in);
		System.out.print("Veuillez choisir la longueur du tableau: ");
		longueur = sc.nextInt();
		numTab = new int[longueur];
		for (int i = 0; i < numTab.length; i++) {
			System.out.print("Veuillez remplir le tableau: ");
			numTab[i] = sc.nextInt();
		}
		
		int count = longueur;
		for (int i = 0; i < numTab.length - 1; i++) {
			if (numTab[i] > numTab[i + 1]) {
				count--;
			}
		}
        System.out.println("Le tableau est: " + Arrays.toString(numTab));
        System.out.println("La longueur de la sous-suite strictement croissante maximale est : " + count);
		
	}
}
