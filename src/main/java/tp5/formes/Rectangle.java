package tp5.formes;

/**
 * Forme géométrique rectancgle
 * 
 * @author Patrice
 *
 */

public class Rectangle extends Forme {
	private double longueur;
	private double largeur;

	/**
	 * Constructeur de rectangle qui prend la longueur et la largeur
	 * 
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	/**
	 * Calcul de surface de rectangle
	 */
	@Override
	public double calculerSurface() {

		return longueur * largeur;
	}

	/**
	 * Calcul de périmètre de rectangle
	 */
	@Override
	public double calculerPermietre() {
		return 2 * (longueur + largeur);
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

}
