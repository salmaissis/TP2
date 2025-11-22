package exercice_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pivot {
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
		
        List<Integer> pivotsTab = new ArrayList<>();
        for (int i = 1; i < longueur - 1; i++) {
            int current = numTab[i];
            int[] leftTab = Arrays.copyOfRange(numTab, 0, i);
            int[] rightTab = Arrays.copyOfRange(numTab, i + 1, longueur);

            boolean isPivot = true;
            for (int num : leftTab) {
                if (current < num) {
                    isPivot = false;
                    break;
                }
            }
            if (isPivot) {
                for (int num : rightTab) {
                    if (current > num) {
                        isPivot = false;
                        break;
                    }
                }
            }

            if (isPivot) {
                pivotsTab.add(current);
            }
        }
		
		System.out.println("Le tableau est: " + Arrays.toString(numTab));
		System.out.println("Les pivots sont: " + pivotsTab);
	
		
	}
}
