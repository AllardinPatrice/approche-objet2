package fr.diginamic.entites;

public class AdressePostale {
	public int numeroRue;
	public String libelleRue;
	public int codePostal;
	public String ville;
	public static int nbDepartements = 102;

	public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

}
