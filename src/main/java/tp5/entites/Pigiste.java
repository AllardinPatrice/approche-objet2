package tp5.entites;

/**
 * Classe pigiste
 * 
 * @author Patrice
 *
 */
public class Pigiste extends Intervenant {
	/**
	 * Nombre de jours travaillés du pigiste
	 */
	int nombreJoursTravailles;
	/**
	 * Montant journalier du pigiste
	 */
	double montantJournalier;

	/**
	 * Constructeur du pigiste
	 * 
	 * @param nom
	 * @param prenom
	 */
	public Pigiste(String nom, String prenom) {
		super(nom, prenom);
		// System.out.println("Statut : Pigiste");
	}

	/**
	 * Affichage des données
	 */
	public void afficherDonnees() {
		super.afficherDonnees();
		System.out.println("Statut : Pigiste");
	}

	@Override
	public double getSalaire() {
		return nombreJoursTravailles * montantJournalier;
	}

	public int getNombreJoursTravailles() {
		return nombreJoursTravailles;
	}

	public void setNombreJoursTravailles(int nombreJoursTravailles) {
		this.nombreJoursTravailles = nombreJoursTravailles;
	}

	public double getMontantJournalier() {
		return montantJournalier;
	}

	public void setMontantJournalier(double montantJournalier) {
		this.montantJournalier = montantJournalier;
	}

}
