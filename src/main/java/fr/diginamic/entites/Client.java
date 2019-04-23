package fr.diginamic.entites;

public class Client {
	public int numeroCompte;
	public String nom;
	public String prenom;

	public Client(int param, String param2, String param3) {
		numeroCompte = param;
		nom = param2;
		prenom = param3;
		System.out.println("Nouvelle instance créée : " + param);
		System.out.println("Numéro de compte : " + numeroCompte);
		System.out.println("Nom : " + nom);
		System.out.println("Prénom : " + prenom);
	}

}
