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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pays other = (Pays) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
}
