package tp5.essais;

import tp5.entites.Pigiste;
import tp5.entites.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		/**
		 * Test de chacun des intervenants
		 */
		Salarie s1 = new Salarie("Allardin", "Patrice");
		s1.setSalaireMensuel(2000);
		s1.afficherDonnees();
		Pigiste p1 = new Pigiste("Racine", "Sandra");
		p1.setMontantJournalier(500);
		p1.setNombreJoursTravailles(20);
		p1.afficherDonnees();

	}

}
