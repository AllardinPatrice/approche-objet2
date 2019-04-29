package listes;

import java.util.ArrayList;

/**
 * Tests sur la classe Ville
 * 
 * @author Patrice
 *
 */
public class TestVille {

	public static void main(String[] args) {
		/**
		 * Création de la liste des villes
		 */
		ArrayList<Ville> alv = new ArrayList<Ville>();
		/**
		 * Ajout des différentes villes
		 */
		alv.add(new Ville("Nice", 343000));
		alv.add(new Ville("Carcassonne", 47800));
		alv.add(new Ville("Narbonne", 54400));
		alv.add(new Ville("Lyon", 484000));
		alv.add(new Ville("Foix", 9700));
		alv.add(new Ville("Pau", 77200));
		alv.add(new Ville("Marseille", 850700));
		alv.add(new Ville("Tarbes", 40600));

		/**
		 * Recherche et affichage de la ville la plus peuplée
		 */
		int indexVillePlusPeuplee = 0;
		int tailleVillePlusPeuplee = 0;
		for (int i = 0; i < alv.size(); i++) {
			if (alv.get(i).getNbHabitants() > tailleVillePlusPeuplee) {
				tailleVillePlusPeuplee = alv.get(i).getNbHabitants();
				indexVillePlusPeuplee = i;
			}
		}
		System.out.println("La ville la plus peuplée est : " + alv.get(indexVillePlusPeuplee).getNom() + " avec : "
				+ alv.get(indexVillePlusPeuplee).getNbHabitants() + " habitants");

		/**
		 * Suppression de la ville la moins peuplée
		 */
		int indexVilleMoinsPeuplee = 0;
		int tailleVilleMoinsPeuplee = alv.get(0).getNbHabitants();
		for (int i = 0; i < alv.size(); i++) {
			if (alv.get(i).getNbHabitants() < tailleVilleMoinsPeuplee) {
				indexVilleMoinsPeuplee = i;
				tailleVilleMoinsPeuplee = alv.get(i).getNbHabitants();
			}
		}
		/**
		 * Suppression effective
		 */
		alv.remove(indexVilleMoinsPeuplee);
		/**
		 * Affichage de la liste
		 */
		System.out.println("Liste des villes :");
		for (int i = 0; i < alv.size(); i++) {
			System.out.println(
					" Ville : " + alv.get(i).getNom() + " Nombre d'habitants : " + alv.get(i).getNbHabitants());
		}

		/**
		 * Mise en majuscules des villes de plus de 100000 habitants
		 */
		for (int i = 0; i < alv.size(); i++) {
			if (alv.get(i).getNbHabitants() > 100000) {
				alv.get(i).setNom(alv.get(i).getNom().toUpperCase());
			}
		}

		/**
		 * Affichage de la liste
		 */
		System.out.println("Liste des villes :");
		for (int i = 0; i < alv.size(); i++) {
			System.out.println(
					" Ville : " + alv.get(i).getNom() + " Nombre d'habitants : " + alv.get(i).getNbHabitants());
		}

	}

}
