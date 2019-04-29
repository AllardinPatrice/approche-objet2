package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Test de la classe Pay
 * 
 * @author Patrice
 *
 */
public class TestPays {

	public static void main(String[] args) {
		/**
		 * Création du set de pays
		 */
		Set<Pays> sp = new HashSet<Pays>();
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

		/**
		 * Recherche du pays avec le PIB par habitant le plus important
		 */
		Iterator<Pays> iterator = sp.iterator();
		Long plusGrandPIBParHabitant = Long.MIN_VALUE;
		String paysPlusGrandPIBParHabitant = null;
		while (iterator.hasNext()) {
			Pays paysTmp = iterator.next();
			if (plusGrandPIBParHabitant < paysTmp.getPibHabitant()) {
				plusGrandPIBParHabitant = paysTmp.getPibHabitant();
				paysPlusGrandPIBParHabitant = paysTmp.getNom();
			}
		}
		/**
		 * Affichage du résultat
		 */
		System.out.println("Le pays avec le plus grand PIB par habitant est : " + paysPlusGrandPIBParHabitant
				+ " avec : " + plusGrandPIBParHabitant);

		/**
		 * Recherche du pays avec le PIB le plus important
		 */
		iterator = sp.iterator();
		Long plusGrandPIB = Long.MIN_VALUE;
		String paysPlusGrandPIB = null;
		while (iterator.hasNext()) {
			Pays paysTmp = iterator.next();
			if (plusGrandPIB < paysTmp.getPibHabitant() * paysTmp.getNbHabitants()) {
				plusGrandPIB = paysTmp.getPibHabitant() * paysTmp.getNbHabitants();
				paysPlusGrandPIB = paysTmp.getNom();
			}
		}
		/**
		 * Affichage du résultat
		 */
		System.out.println("Le pays avec le plus grand PIB est : " + paysPlusGrandPIB + " avec : " + plusGrandPIB);

		/**
		 * Mise en majuscule du pays avec le plus petit PIB
		 */
		iterator = sp.iterator();
		Long plusPetitPIB = Long.MAX_VALUE;
		String nomPaysPlusPetitPIB = null;
		Pays paysPlusPetitPIB = null;
		while (iterator.hasNext()) {
			Pays paysTmp = iterator.next();
			if (plusPetitPIB > paysTmp.getPibHabitant() * paysTmp.getNbHabitants()) {
				plusPetitPIB = paysTmp.getPibHabitant() * paysTmp.getNbHabitants();
				nomPaysPlusPetitPIB = paysTmp.getNom();
				paysPlusPetitPIB = paysTmp;
			}
		}
		/**
		 * Modification du pays en majuscules
		 */
		paysPlusPetitPIB.setNom(paysPlusPetitPIB.getNom().toUpperCase());
		/**
		 * Affichage du résultat
		 */
		iterator = sp.iterator();
		System.out.println("Plus petit PIB");
		while (iterator.hasNext()) {
			Pays paysTmp = iterator.next();
			System.out.println(
					"Pays : " + paysTmp.getNom() + " PIB : " + paysTmp.getNbHabitants() * paysTmp.getPibHabitant());
		}

		/**
		 * Suppression de ce pays avec le plus petit PIB
		 */
		System.out.println("Suppression Pays : " + paysPlusPetitPIB.getNom() + " Nombre d'habitants : "
				+ paysPlusPetitPIB.getNbHabitants() + " PIB total : "
				+ paysPlusPetitPIB.getNbHabitants() * paysPlusPetitPIB.getPibHabitant());
		System.out.println(sp.remove(paysPlusPetitPIB));

		/**
		 * Affichage du résultat
		 */
		iterator = sp.iterator();
		System.out.println("Après suppression du plus petit PIB");
		while (iterator.hasNext()) {
			Pays paysTmp = iterator.next();
			System.out.println("Pays : " + paysTmp.getNom() + " Nombre d'habitants : " + paysTmp.getNbHabitants()
					+ " PIB total : " + paysTmp.getNbHabitants() * paysTmp.getPibHabitant());
		}

	}

}
