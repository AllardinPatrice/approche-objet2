package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

/**
 * Test de calcul de moyenne
 * 
 * @author Patrice
 *
 */
public class TestMoyenne {

	public static void main(String[] args) {
		/**
		 * Construction d'un calcul de moyenne
		 */
		CalculMoyenne c1 = new CalculMoyenne(/* 2 */);
		/**
		 * Ajout de 2 valeurs
		 */
		c1.ajout(1);
		c1.ajout(2);
		/**
		 * Calcul et affichage de moyenne
		 */
		System.out.println("Moyenne : " + c1.calcul());

		/**
		 * Construction d'un calcul de moyenne
		 */
		CalculMoyenne c2 = new CalculMoyenne(/* 8 */);
		/**
		 * Ajout de 8 valeurs
		 */
		c2.ajout(1);
		c2.ajout(2);
		c2.ajout(3);
		c2.ajout(4);
		c2.ajout(5);
		c2.ajout(6);
		c2.ajout(7);
		c2.ajout(8);
		/**
		 * Calcul et affichage de moyenne
		 */
		System.out.println("Moyenne : " + c2.calcul());

		/**
		 * Construction de nouvelle moyenne mais plus de problème de taille
		 * négative
		 */
		CalculMoyenne c3 = new CalculMoyenne(/*-1*/);

		/**
		 * Construction d'un calcul de moyenne
		 */
		CalculMoyenne c4 = new CalculMoyenne(/* 2 */);
		/**
		 * Ajout de 3 valeurs
		 */
		c4.ajout(1);
		c4.ajout(2);
		c4.ajout(3);
		/**
		 * Calcul et affichage de moyenne
		 */
		System.out.println("Moyenne : " + c4.calcul());
	}

}
