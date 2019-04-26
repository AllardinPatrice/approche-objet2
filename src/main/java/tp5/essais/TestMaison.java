package tp5.essais;

import tp5.entites.Chambre;
import tp5.entites.Maison;
import tp5.entites.Piece;
import tp5.entites.Wc;

/**
 * Test de maison
 * 
 * @author Patrice
 *
 */
public class TestMaison {

	public static void main(String[] args) {
		// Création d'une maison
		Maison m1 = new Maison();
		// Ajout d'une pièce
		Piece ch1 = new Chambre(20, 1);
		m1.ajouterPiece(ch1);
		// Ajout d'un pièce
		m1.ajouterPiece(new Wc(10, 0));
		m1.ajouterPiece(new Chambre(10, 0));
		m1.ajouterPiece(new Chambre(30, 2));
		// Affichage des superficies
		System.out.println("Superficie totale : " + m1.calculerSurface());
		System.out.println("Superficie totale par étage : " + m1.getSuperficieTotaleParEtage(0));
		System.out.println("Superficie totale par type : Chambre : " + m1.getSuperficieParTypePiece("Chambre"));
		// Affichage du nombre de pièces par type
		System.out.println("Nombre de pièces par type : Chambre : " + m1.getNbPiecesParTypePiece("Chambre"));
	}

}
