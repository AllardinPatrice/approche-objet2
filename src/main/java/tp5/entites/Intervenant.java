package tp5.entites;

/**
 * Classe mère des intervenants
 * 
 * @author Patrice
 *
 */
public abstract class Intervenant {
	private String nom;
	private String prenom;

	/**
	 * Constructeur de l'intervenant
	 * 
	 * @param nom
	 * @param prenom
	 */
	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * Méthode de lecture de salaire
	 * 
	 * @return
	 */
	public abstract double getSalaire();

	/**
	 * Méthode d'affichage des données nom prénom et salaire
	 */
	public void afficherDonnees() {
		System.out.println("Données : Nom : " + nom + " Prénom : " + prenom + " Salaire : " + getSalaire());
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
