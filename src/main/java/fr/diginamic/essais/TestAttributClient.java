package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;

public class TestAttributClient {

	public static void main(String[] args) {
		AdressePostale a = new AdressePostale(25, "Rue Lamarck", 85000, "La Roche sur Yon");
		AdressePostale b = new AdressePostale(5, "Rue Lapierre", 88000, "La Pierre");
		a.nbDepartements = 103;
		System.out.println("Nombre départements a : " + a.nbDepartements);
		System.out.println("Nombre départements b : " + b.nbDepartements);
		System.out.println("Nombre départements classe : " + AdressePostale.nbDepartements);
	}

}
