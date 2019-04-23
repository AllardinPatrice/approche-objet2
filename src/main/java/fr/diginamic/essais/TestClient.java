package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;
import fr.diginamic.entites.Client;

public class TestClient {

	public static void main(String[] args) {
		Client client1 = new Client(1, "Allaradin", "Patrice");
		Client client2 = new Client(2, "Racine", "Luc");
		// Vérification des valeurs assignées par le constructeur
		System.out.println("Numéro de compte client1 : " + client1.numeroCompte);
		System.out.println("Numéro de compte client2 : " + client2.numeroCompte);
		System.out.println("Nom client1 : " + client1.nom);
		System.out.println("Nom client2 : " + client2.nom);
		System.out.println("Prénom client1 : " + client1.prenom);
		System.out.println("Prénom client2 : " + client2.prenom);
		AdressePostale adresse = new AdressePostale(25, "Rue Lamarck", 85000, "La Roche sur Yon");
		Client client3 = new Client(3210, "Racine", "Alicia", adresse);
		System.out.println("Client 3 Numéro de compte : " + client3.numeroCompte);
		System.out.println("Client 3 Nom : " + client3.nom);
		System.out.println("Client 3 Prenom : " + client3.prenom);
		System.out.println("Client 3 Numéro de rue : " + client3.adresse.numeroRue);
		System.out.println("Client 3 Nnom de rue : " + client3.adresse.libelleRue);
		System.out.println("Client 3 Code postal : " + client3.adresse.codePostal);
		System.out.println("Client 3 Ville : " + client3.adresse.ville);
	}

}
