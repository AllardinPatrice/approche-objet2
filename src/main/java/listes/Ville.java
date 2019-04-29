package listes;

/**
 * Classe ville
 * 
 * @author Patrice
 *
 */
public class Ville {
	/**
	 * Constructeur de ville
	 * 
	 * @param nom
	 * @param nbHabitants
	 */
	public Ville(String nom, int nbHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}

	/**
	 * Nom de ville
	 */
	private String nom;
	/**
	 * Nombre d'habitants
	 */
	private int nbHabitants;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

}
