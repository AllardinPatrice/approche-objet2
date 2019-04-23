package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale adresse1 = new AdressePostale(5, "rue Lamarck", 85000, "La Roche sur Yon");
		// adresse1.numeroRue = 5;
		// adresse1.libelleRue = "rue Lamarack";
		// adresse1.codePostal = 85000;
		// adresse1.ville = "La Roche";
		AdressePostale adresse2 = new AdressePostale(25, "Rue du Lac", 88000, "La Pierre");
		// adresse2.numeroRue = 25;
		// adresse2.libelleRue = "rue du Lac";
		// adresse2.codePostal = 88000;
		// adresse2.ville = "La Pierre";
		System.out.println(adresse1);
		System.out.println(adresse2);
	}

}
