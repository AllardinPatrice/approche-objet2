package tp5.entites;

/**
 * Classe salarié
 * 
 * @author Patrice
 *
 */
public class Salarie extends Intervenant {
	/**
	 * Constructeur de salarié
	 * 
	 * @param nom
	 * @param prenom
	 */
	public Salarie(String nom, String prenom) {
		super(nom, prenom);
		// System.out.println("Statut : Salarié");
	}

	/**
	 * Affichage des données
	 */
	public void afficherDonnees() {
		super.afficherDonnees();
		System.out.println("Statut : Salarié");
	}

	/**
	 * Salaire mensuel de salarié
	 */
	private double salaireMensuel;

	@Override
	public double getSalaire() {
		return salaireMensuel;

	}

	public double getSalaireMensuel() {
		return salaireMensuel;
	}

	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}

}
