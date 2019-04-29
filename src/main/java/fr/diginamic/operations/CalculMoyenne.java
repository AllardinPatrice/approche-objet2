package fr.diginamic.operations;

import java.util.ArrayList;

/**
 * Classe de calcul de moyenne Mis en commentaire de tous les éléments inutiles
 * en utilisant une ArrayList
 * 
 * @author Patrice
 *
 */
public class CalculMoyenne {
	// private double[] tab = new double[0];
	private ArrayList<Double> alcm;
	// private int index = 0;
	// private int tailleTableau = 0;

	// public double[] getTab() {
	// return tab;
	// }

	public CalculMoyenne(/* int tailleTableau */) {
		// if (tailleTableau > 0) {
		// this.tailleTableau = tailleTableau;
		// tab = new double[tailleTableau];
		alcm = new ArrayList<Double>();

		// } else {
		// System.err.println("Taille de tableau négative");
		// }
	}

	public void ajout(double param) {
		alcm.add(param);
		// if (index < tailleTableau) {
		// tab[index++] = param;
		// } else {
		// System.err.println("Trop de valeurs");
		// }

	}

	public double calcul() {
		double moyenne = 0.0;
		// for (int i = 0; i < tailleTableau; i++) {
		for (int i = 0; i < alcm.size(); i++) {
			// moyenne += tab[i] / tailleTableau;
			moyenne += alcm.get(i).doubleValue() / alcm.size();
		}
		return moyenne;
	}

	// public void setTab(double[] tab) {
	// this.tab = tab;
	// }

	// public int getIndex() {
	// return index;
	// }

	// public void setIndex(int index) {
	// this.index = index;
	// }

	// public int getTailleTableau() {
	// return tailleTableau;
	// }

	// public void setTailleTableau(int tailleTableau) {
	// this.tailleTableau = tailleTableau;
	// }
}
