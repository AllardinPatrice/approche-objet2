package tri;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Test du tri
 * 
 * @author Patrice
 *
 */
public class TestTri {

	public static void main(String[] args) {
		/**
		 * Création du set de pays
		 */
		ArrayList<Pays> sp = new ArrayList<Pays>();
		/**
		 * Ajout des valeurs de pays
		 */
		sp.add(new Pays("USA", 327167434, 55805));
		sp.add(new Pays("France", 67795000, 38476));
		sp.add(new Pays("Allemagne", 82979100, 47589));
		sp.add(new Pays("UK", 65105246, 43770));
		sp.add(new Pays("Italie", 60483973, 29866));
		sp.add(new Pays("Japon", 126330302, 39058));
		sp.add(new Pays("Chine", 1417913092, 7989));
		sp.add(new Pays("Russie", 146780700, 11099));
		sp.add(new Pays("Inde", 1296834042, 1626));

		Collections.sort(sp);

		/**
		 * Affichage de la liste
		 */
		for (int i = 0; i < sp.size(); i++) {
			// System.out.println(" Pays triés par nom : " +
			// sp.get(i).getNom());
			System.out.println(" Pays triés par PIB par habitant : " + sp.get(i).getNom() + " PIB/habitant : "
					+ sp.get(i).getPibHabitant());
		}

		/**
		 * Tri sur le comparateur par nombre d'habitant
		 */
		sp.sort(new ComparatorHabitant());
		/**
		 * Affichage de la liste
		 */
		for (int i = 0; i < sp.size(); i++) {
			System.out.println(" Pays triés par nombre d'habitants : " + sp.get(i).getNom() + " nombre d'habitants : "
					+ sp.get(i).getNbHabitants());
		}

		/**
		 * Tri sur le comparateur par PIB par habitant
		 */
		sp.sort(new ComparatorPibHabitant());
		/**
		 * Affichage de la liste
		 */
		for (int i = 0; i < sp.size(); i++) {
			System.out.println(" Pays triés par PIB par habitant : " + sp.get(i).getNom() + " PIB par habitant : "
					+ sp.get(i).getPibHabitant());
		}

	}

}
