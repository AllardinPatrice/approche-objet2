package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import sets.Pays;

/**
 * Test de hashmap
 * 
 * @author Patrice
 *
 */
public class TestMapPays {

	public static void main(String[] args) {
		/**
		 * Création de la hashamp
		 */
		Map<String, Pays> msp = new HashMap<String, Pays>();
		/**
		 * Remplissage de la hashmap
		 */
		msp.put("USA", new Pays("USA", 327167434, 55805));
		msp.put("France", new Pays("France", 67795000, 38476));
		msp.put("Allemagne", new Pays("Allemagne", 82979100, 47589));
		msp.put("UK", new Pays("UK", 65105246, 43770));
		msp.put("Italie", new Pays("Italie", 60483973, 29866));
		msp.put("Japon", new Pays("Japon", 126330302, 39058));
		msp.put("Chine", new Pays("Chine", 1417913092, 7989));
		msp.put("Russie", new Pays("Russie", 146780700, 11099));
		msp.put("Inde", new Pays("Inde", 1296834042, 1626));

		/**
		 * Listage des clés de la map
		 */
		Iterator<String> keys = msp.keySet().iterator();
		/**
		 * Affichage de chaque clé
		 */
		while (keys.hasNext()) {
			System.out.println(keys.next());
		}

		/**
		 * Listage des différentes valeurs de la map
		 */
		Iterator<Pays> values = msp.keySet().iterator();
		/**
		 * Affichage de chaque valeur
		 */
		while (values.hasNext()) {
			System.out.println(values.next());
		}

		/**
		 * Suppression du pays qui a le moins d'habitants
		 */

	}

}
