package fr.diginamic.essais;

import fr.diginamic.entites.Client;

public class TestClient {

	public static void main(String[] args) {
		Client client1 = new Client(1, "Allaradin", "Patrice");
		Client client2 = new Client(2, "Racine", "Luc");
		System.out.println("Numéro de compte client1 : " + client1.numeroCompte);
		System.out.println("Numéro de compte client2 : " + client2.numeroCompte);
		System.out.println("Nom client1 : " + client1.nom);
		System.out.println("Nom client2 : " + client2.nom);
		System.out.println("Prénom client1 : " + client1.prenom);
		System.out.println("Prénom client2 : " + client2.prenom);
		
	}

}
