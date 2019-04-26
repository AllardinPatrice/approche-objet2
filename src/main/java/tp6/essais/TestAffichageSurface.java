package tp6.essais;

import tp5.entites.Carre;
import tp5.entites.Chambre;
import tp5.entites.Maison;
import tp5.entites.Rectangle;
import tp5.entites.Wc;
import tp6.entites.AffichageSurface;

/**
 * Test de l'interface de surface
 * 
 * @author Patrice
 *
 */
public class TestAffichageSurface {

	public static void main(String[] args) {
		/**
		 * Création d'une surface
		 */
		AffichageSurface as1 = new AffichageSurface();
		/**
		 * Création d'une maison
		 */
		Maison m1 = new Maison();
		m1.ajouterPiece(new Chambre(10, 0));
		m1.ajouterPiece(new Wc(5, 1));
		/**
		 * Affichage de la surface de la maison
		 */
		as1.afficher(m1);

		/**
		 * Création de formes
		 */
		Rectangle r1 = new Rectangle(2.0, 3.0);
		Carre c2 = new Carre(3.0);
		/**
		 * Affichage des formes
		 */
		as1.afficher(r1);
		as1.afficher(c2);

	}

}
