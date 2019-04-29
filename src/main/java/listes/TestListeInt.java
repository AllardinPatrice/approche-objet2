package listes;

import java.util.ArrayList;

/**
 * Test des listes d'entiers
 * 
 * @author Patrice
 *
 */
public class TestListeInt {

	public static void main(String[] args) {
		/**
		 * Création et remplissage du tableau
		 */
		ArrayList<Integer> i1 = new ArrayList<Integer>();
		i1.add(-1);
		i1.add(5);
		i1.add(7);
		i1.add(3);
		i1.add(-2);
		i1.add(4);
		i1.add(8);
		i1.add(5);

		/**
		 * Affichage de la liste
		 */
		for (int i = 0; i < i1.size(); i++) {
			System.out.println("Indice : " + i + " Valeur : " + i1.get(i));
		}

		/**
		 * Recherche du plus grand élément de la liste
		 */
		int plusGrand = i1.get(0);
		for (int i = 0; i < i1.size(); i++) {
			if (i1.get(i) > plusGrand)
				plusGrand = i1.get(i);
		}
		System.out.println("Plus grand élément : " + plusGrand);

		/**
		 * Suppression du plus petit élément de liste
		 */
		int indexPlusPetit = 0;
		int plusPetit = i1.get(0);
		for (int i = 0; i < i1.size(); i++) {
			if (i1.get(i) < plusPetit) {
				plusPetit = i1.get(i);
				indexPlusPetit = i;
			}
		}
		i1.remove(indexPlusPetit);
		/**
		 * Affichage de la liste
		 */
		for (int i = 0; i < i1.size(); i++) {
			System.out.println("Après suppression plus petit : Indice : " + i + " Valeur : " + i1.get(i));
		}

		/**
		 * inversion des lignes négatives
		 */
		for (int i = 0; i < i1.size(); i++) {
			if (i1.get(i) < 0)
				i1.set(i, -i1.get(i));
		}
		/**
		 * Affichage de la liste
		 */
		for (int i = 0; i < i1.size(); i++) {
			System.out.println("Après inversion des négatifs : Indice : " + i + " Valeur : " + i1.get(i));
		}

	}

}
