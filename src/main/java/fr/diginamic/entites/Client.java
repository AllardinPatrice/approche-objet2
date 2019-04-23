package fr.diginamic.entites;

public class Client {
	public int numeroCompte;
	public String nom;
	public String prenom;
	public AdressePostale adresse;

	public Client(int numeroCompte, String nom, String prenom, AdressePostale adresse) {
		// this.numeroCompte = numeroCompte;
		// this.nom = nom;
		// this.prenom = prenom;
		this(numeroCompte, nom, prenom);
		this.adresse = adresse;
	}

	public Client(int param, String param2, String param3) {
		numeroCompte = param;
		nom = param2;
		prenom = param3;
		System.out.println("Nouvelle instance créée : " + param);
		System.out.println("Numéro de compte : " + numeroCompte);
		System.out.println("Nom : " + nom);
		System.out.println("Prénom : " + prenom);
	}

	public String getPrenom() {
		return prenom;
	}

	public String getNomMajuscules() {
		return nom.toUpperCase();
	}

	public String getNom() {
		return nom;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
}
