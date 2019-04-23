package fr.diginamic.entites;

public class Cercle {
	double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double perimetreCercle() {
		return 2 * Math.PI * rayon;
	}

	public double surfaceCercle() {
		return Math.PI * Math.pow(rayon, 2);
	}
}
