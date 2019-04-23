package fr.diginamic.operations;

public class CalculMoyenne {
	public double[] tab = new double[0];
	public int index = 0;
	public int tailleTableau = 0;

	public CalculMoyenne(int tailleTableau) {
		if (tailleTableau > 0) {
			this.tailleTableau = tailleTableau;
			tab = new double[tailleTableau];
		} else {
			System.err.println("Taille de tableau négative");
		}
	}

	public void ajout(double param) {
		if (index < tailleTableau) {
			tab[index++] = param;
		} else {
			System.err.println("Trop de valeurs");
		}

	}

	public double calcul() {
		double moyenne = 0.0;
		for (int i = 0; i < tailleTableau; i++) {
			moyenne += tab[i] / tailleTableau;
		}
		return moyenne;
	}
}
