package tp5.utils;

import java.util.Scanner;

import tp5.entites.Hero;

/**
 * Classe d'affichages en menus
 * 
 * @author Patrice
 *
 */
public class MenuJeu {
	public static Scanner scanner;

	/**
	 * Affichage du menu
	 */
	public static void afficher() {
		System.out.println("1 : Créer le personnage");
		System.out.println("2 : Combattre une créature");
		System.out.println("3 : Afficher le score");
		System.out.println("4 : Sortir");
	}

	/**
	 * Affichage du choix de créature
	 */
	public static void afficherCreature() {
		System.out.println("1 : Loup");
		System.out.println("2 : Gobelin");
		System.out.println("3 : Troll");
	}

	/**
	 * Affichage du score
	 * 
	 * @param h1
	 */
	public static void afficherScore(Hero h1) {
		System.out.println("Le score du héros est : " + h1.getScore());
	}

}
