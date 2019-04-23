package fr.diginamic.essais;

import fr.diginamic.utils.TriTableau;

public class TestTri {

	public static void main(String[] args) {
		int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };
		TriTableau tri1 = new TriTableau();
		tri1.trierTableau(array2);
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Indice : " + i + " Valeur : " + array2[i]);
		}
	}

}
