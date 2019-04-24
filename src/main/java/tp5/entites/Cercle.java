package tp5.entites;

/**
 * Forme géométrique cercle
 * 
 * @author Patrice
 *
 */
public class Cercle extends Forme {
	private double rayon;

	/**
	 * Constructeur qui prend le rayon du cercle
	 * 
	 * @param rayon
	 */
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	/**
	 * Calcul de perimètre de cercle
	 */
	public double calculerPermietre() {
		return 2 * Math.PI * rayon;
	}

	/**
	 * Calcul de surface de cercle
	 * 
	 * @return
	 */
	public double calculerSurface() {
		return Math.PI * Math.pow(rayon, 2);
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
