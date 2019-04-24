package tp5.utils;

import tp5.formes.Forme;

/**
 * 
 * @author Patrice
 *
 */
public class AffichageForme {
	public static void afficher(Forme f1) {
		System.out.println("Périmètre de la forme : " + f1.calculerPermietre());
		System.out.println("Surface de la forme : " + f1.calculerSurface());
	}

}
