package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Classe de test des sets de doubles
 * 
 * @author Patrice
 *
 */
public class TestSetDouble {

	public static void main(String[] args) {
		/**
		 * Création de l'objet hashset héritant de set
		 */
		Set<Double> hsd = new HashSet<Double>();
		/**
		 * Ajout des doubles dans le set
		 */
		hsd.add(1.5);
		hsd.add(8.25);
		hsd.add(-7.32);
		hsd.add(13.3);
		hsd.add(-12.45);
		hsd.add(48.5);
		hsd.add(0.01);
		hsd.add(13.3);

		/**
		 * Affichage du set
		 */
		System.out.println(hsd);
		/**
		 * Le set n'affiche pas dans l'ordre rentré à cause de la valeur de
		 * hachage (en fonction du nombre de caractères)
		 */

		/**
		 * Plus grand élément de la collection
		 */
		Iterator<Double> iterator = hsd.iterator();
		Double plusGrand = Double.MIN_VALUE;
		while (iterator.hasNext()) {
			Double tmp = iterator.next();
			if (plusGrand < tmp) {
				plusGrand = tmp;
			}
		}
		/**
		 * Affichage de la valeur
		 */
		System.out.println("Plus grande valeur : " + plusGrand);
	}

}
