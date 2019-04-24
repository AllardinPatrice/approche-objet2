package tp5.utils;

import tp5.entites.Carre;
import tp5.entites.Cercle;
import tp5.entites.Rectangle;

/**
 * Test des méthodes liées aux formes
 * 
 * @author Patrice
 *
 */
public class TestForme {

	public static void main(String[] args) {
		// Définition des formes de travail
		Cercle c1 = new Cercle(5.0);
		Rectangle r1 = new Rectangle(2.0, 3.0);
		Carre c2 = new Carre(3.0);
		/*
		 * Affichage des inforamtions du cercle
		 */
		AffichageForme.afficher(c1);
		/*
		 * Affichage des inforamtions du rectangle
		 */

		AffichageForme.afficher(r1);
		/*
		 * Affichage des inforamtions du carré
		 */
		AffichageForme.afficher(c2);
	}

}
