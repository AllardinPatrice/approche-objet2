package tp5.essais;

import java.util.Scanner;

import tp5.entites.Arene;
import tp5.entites.Hero;
import tp5.utils.MenuJeu;

/**
 * Classe test de jeu de rôle
 * 
 * @author Patrice
 *
 */
public class TestJeuDeRole {

	public static void main(String[] args) {
		Hero h1 = null;
		int valeur = 0;
		MenuJeu.scanner = new Scanner(System.in);

		// Tant que le joueur ne veut pas sortir
		while (valeur != 4) {
			MenuJeu.afficher();
			valeur = MenuJeu.scanner.nextInt();
			if (valeur == 1) {
				// Création de personnage
				h1 = new Hero();
			} else if (valeur == 2) {
				// Combat de créature
				Arene.combattreCreature(h1);
			} else if (valeur == 3) {
				// Affichage de score
				MenuJeu.afficherScore(h1);
			}
		}
		// Fermeture de scanner
		MenuJeu.scanner.close();

	}

}
