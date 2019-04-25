package tp5.entites;

import tp5.utils.MenuJeu;

/**
 * Classe arène de combat
 * 
 * @author Patrice
 *
 */
public class Arene {

	/**
	 * Méthode de combat contre le héros
	 * 
	 * @param h1
	 */
	public static void combattreCreature(Hero h1) {
		MenuJeu.afficherCreature();
		int valeur = 0;
		valeur = MenuJeu.scanner.nextInt();
		if (valeur == 1) {
			// Loup
			// Création de loup
			Loup l1 = new Loup();
			// Combat de loup
			combattreCreatureConnue(h1, l1);
			// Incrément ou non du nombre de points de vie
			if (h1.getPointsDeVie() > 0)
				h1.setScore(h1.getScore() + 1);
		} else if (valeur == 2) {
			// Gobelin
			Gobelin g1 = new Gobelin();
			combattreCreatureConnue(h1, g1);
			// Incrément ou non du nombre de points de vie
			if (h1.getPointsDeVie() > 0)
				h1.setScore(h1.getScore() + 2);
		} else if (valeur == 3) {
			// Troll
			Troll t1 = new Troll();
			combattreCreatureConnue(h1, t1);
			// Incrément ou non du nombre de points de vie
			if (h1.getPointsDeVie() > 0)
				h1.setScore(h1.getScore() + 5);
		}

	}

	/**
	 * Méthode de combat quand une créature est connue
	 * 
	 * @param h1
	 * @param cc1
	 */
	public static void combattreCreatureConnue(Hero h1, Creature cc1) {
		// Tant que les points de vie des 2 sont positifs
		while ((h1.getPointsDeVie() > 0) && (cc1.getPointsDeVie() > 0)) {
			// Calcul de frappe du héro et de la créature
			int frappeHero = h1.getForce() + (int) (Math.random() * 10) + 1;
			int frappeCreature = cc1.getForce() + (int) (Math.random() * 10) + 1;
			if (frappeHero >= frappeCreature) {
				System.out.println("Hero Remporte le tour");
				cc1.setPointsDeVie(cc1.getPointsDeVie() - frappeHero + frappeCreature);
			} else {
				System.out.println("Creature Remporte le tour");
				h1.setPointsDeVie(h1.getPointsDeVie() - frappeCreature + frappeHero);
			}
			System.out.println("Points de vie héro : " + h1.getPointsDeVie());
			System.out.println("Points de vie créature : " + cc1.getPointsDeVie());
		}

	}
}
