package fr.diginamic.utils;

public class TriTableau {
	public void trierTableau(int[] tab) {

		for (int i = tab.length - 1; i >= 1; i--) {
			for (int j = 0; j <= i - 1; j++) {
				if (tab[j + 1] < tab[j]) {
					int c = 0;
					c = tab[j + 1];
					tab[j + 1] = tab[j];
					tab[j] = c;
				}
			}
		}
	}
}
