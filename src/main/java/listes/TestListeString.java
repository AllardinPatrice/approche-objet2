package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		/**
		 * Création d'arraylist de string
		 */
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("Nice");
		s1.add("Carcassonne");
		s1.add("Narbonne");
		s1.add("Lyon");
		s1.add("Foix");
		s1.add("Pau");
		s1.add("Marseille");
		s1.add("Tarbes");
		/**
		 * Recherche de la ville avec le plus nombre de lettre
		 */
		int nombreLettreMax = 0;
		int indexLettreMax = 0;
		for (int i = 0; i < s1.size(); i++) {
			if (s1.get(i).length() > nombreLettreMax) {
				nombreLettreMax = s1.get(i).length();
				indexLettreMax = i;
			}
		}
		System.out.println("La ville avec le plus grand nombre de lettres est : indice : " + indexLettreMax
				+ " Valeur : " + s1.get(indexLettreMax));

		/**
		 * Mise en majuscules des noms de villes
		 */
		for (int i = 0; i < s1.size(); i++) {
			s1.set(i, s1.get(i).toUpperCase());
		}
		/**
		 * Affichage de la liste
		 */
		System.out.println("Villes en majuscules : ");
		for (int i = 0; i < s1.size(); i++) {
			System.out.println(s1.get(i));
		}

		/**
		 * Suppression de la liste les villes qui commencent par un N
		 */
		Iterator<String> iterator = s1.iterator();
		while (iterator.hasNext()) {
			String maChaine = iterator.next();
			if (maChaine.startsWith("N"))
				iterator.remove();
		}
		// for (int i = 0; i < s1.size(); i++) {
		// if (s1.get(i).startsWith("N")) {
		// s1.remove(i);
		// }
		// }
		/**
		 * Affichage de la liste
		 */
		System.out.println("Villes sans première lettre N : ");
		for (int i = 0; i < s1.size(); i++) {
			System.out.println(s1.get(i));
		}

	}

}
