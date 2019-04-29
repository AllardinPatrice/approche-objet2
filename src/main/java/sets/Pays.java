package sets;

/**
 * Classe pays
 * 
 * @author Patrice
 *
 */
public class Pays {
	/**
	 * Attributs des pays (nom, nbhabitants, pib par habitant)
	 */
	private String nom;
	private long nbHabitants;
	private long pibHabitant;

	public String getNom() {
		return nom;
	}

	/**
	 * Constrcuteur du pays
	 * 
	 * @param nom
	 * @param nbHabitants
	 * @param pibHabitant
	 */
	public Pays(String nom, long nbHabitants, long pibHabitant) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibHabitant = pibHabitant;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(long nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public long getPibHabitant() {
		return pibHabitant;
	}

	public void setPibHabitant(long pibHabitant) {
		this.pibHabitant = pibHabitant;
	}

}
