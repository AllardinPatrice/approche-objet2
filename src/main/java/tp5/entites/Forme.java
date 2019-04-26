package tp5.entites;

import tp6.entites.ISurface;

/**
 * Forme géométrique
 * 
 * @author Patrice
 *
 */
public abstract class Forme implements ISurface {
	/**
	 * Calcul de surface de forme
	 * 
	 * @return
	 */
	public abstract double calculerSurface();

	/**
	 * Calcul de périmetre de forme
	 * 
	 * @return
	 */
	public abstract double calculerPermietre();
}
