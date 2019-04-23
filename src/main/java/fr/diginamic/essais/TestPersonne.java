package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;
import fr.diginamic.entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne personne1 = new Personne();
		personne1.nom = "Allardin";
		personne1.prenom = "Patrice";
		personne1.adressePostale = new AdressePostale(5, "Rue Lamarck", 85000, "La Roche");
		// personne1.adressePostale.numeroRue = 5;
		// personne1.adressePostale.libelleRue = "Rue Lamarck";
		// personne1.adressePostale.codePostal = 85000;
		// personne1.adressePostale.ville = "La Roche";
		Personne personne2 = new Personne();
		personne2.nom = "Allardin";
		personne2.prenom = "Luc";
		personne2.adressePostale = new AdressePostale(25, "Rue des Pierres", 88000, "La Roche");
		// personne2.adressePostale.numeroRue = 25;
		// personne2.adressePostale.libelleRue = "Rue des Pierres";
		// personne2.adressePostale.codePostal = 88000;
		// personne2.adressePostale.ville = "La Roche";

		AdressePostale adresseFamille = new AdressePostale(5, "Rue Lamarck", 85000, "La Roche");
		// adresseFamille.numeroRue = 5;
		// adresseFamille.libelleRue = "Rue Lamarck";
		// adresseFamille.codePostal = 85000;
		// adresseFamille.ville = "La Roche";

		Personne personne3 = new Personne();
		personne3.nom = "Allardin";
		personne3.prenom = "Patrice";
		personne3.adressePostale = adresseFamille;

		Personne personne4 = new Personne();
		personne4.nom = "Allardin";
		personne4.prenom = "Luc";
		personne4.adressePostale = adresseFamille;

		adresseFamille.numeroRue = 25;

		System.out.println(personne1);
		System.out.println(personne2);
		System.out.println(personne4.adressePostale.numeroRue);

	}

}
