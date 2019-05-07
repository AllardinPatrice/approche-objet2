package tp5.utils;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tp5.entites.Chambre;
import tp5.entites.Maison;

public class MaisonTest {

	@Test
	public void testAjouterPiece() throws MaisonException {
		// Création d'une maison
		Maison maison = new Maison();
		// Ajout d'une pièce de 20m² au RDC
		maison.ajouterPiece(new Chambre(20, 0));
		// Test que la surface de l'étage fait bien 20m²
		assertTrue(maison.getSuperficieTotaleParEtage(0) == 20);
	}

	@Test(expected = MaisonException.class)
	public void testAjouterPieceNulle() throws MaisonException {
		// Création d'un maison
		Maison maison = new Maison();
		// Ajout d'une pièce nulle
		maison.ajouterPiece(null);
		// Vérification que l'exception est bien lancée
		double result = maison.getSuperficieTotaleParEtage(0);
		assertTrue(result == 0);
	}

	@Test
	public void testCalculerSurface() throws MaisonException {
		// Création d'une maison
		Maison maison = new Maison();
		// Ajout d'une pièce de 20m² au RDC
		maison.ajouterPiece(new Chambre(20, 0));
		// Vérification que la surface est bien calculée
		double result = maison.calculerSurface();
		assertTrue(result == 20);

	}

	@Test
	public void testGetSuperficieTotaleParEtage() throws MaisonException {
		// Création d'une maison
		Maison maison = new Maison();
		// Ajout d'une pièce de 20m² au RDC
		maison.ajouterPiece(new Chambre(20, 0));
		// Vérification que la surface est bien calculée
		double result = maison.getSuperficieTotaleParEtage(0);
		assertTrue(result == 20);
	}

	@Test
	public void testMaison() {
		// Création d'une maison
		Maison maison = new Maison();
		// Vérification qu'elle existe
		assertNotNull(maison);
	}

	@Test
	public void testGetSuperficieParTypePiece() throws MaisonException {
		// Création d'une maison
		Maison maison = new Maison();
		// Ajout d'une pièce de 20m² au RDC
		maison.ajouterPiece(new Chambre(20, 0));
		// Vérification que la surface est bien calculée par type de pièce
		double result = maison.getSuperficieParTypePiece("Chambre");
		assertTrue(result == 20);
	}

	@Test
	public void testGetNbPiecesParTypePiece() throws MaisonException {
		// Création d'une maison
		Maison maison = new Maison();
		// Ajout d'une pièce de 20m² au RDC
		maison.ajouterPiece(new Chambre(20, 0));
		// Vérification que la surface est bien calculée par type de pièce
		int result = maison.getNbPiecesParTypePiece("Chambre");
		assertTrue(result == 1);
	}

}
