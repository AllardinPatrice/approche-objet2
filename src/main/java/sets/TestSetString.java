package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {
		/**
		 * Création de l'objet hashset héritant de set
		 */
		Set<String> hss = new HashSet<String>();
		/**
		 * Ajout des pays
		 */
		hss.add("USA");
		hss.add("France");
		hss.add("Allemagne");
		hss.add("UK");
		hss.add("Italie");
		hss.add("Japon");
		hss.add("Chine");
		hss.add("Russie");
		hss.add("Inde");

		/**
		 * Recherche du pays avec le plus grand nombre de lettres
		 */
		Iterator<String> iterator = hss.iterator();
		String plusGrandNombreLettres = "";
		while (iterator.hasNext()) {
			String tmp = iterator.next();
			if (plusGrandNombreLettres.length() < tmp.length()) {
				plusGrandNombreLettres = tmp;
			}
		}
		/**
		 * Affichage du résultat
		 */
		System.out.println("Plus grand nombre de lettres : " + plusGrandNombreLettres);
	}

}
