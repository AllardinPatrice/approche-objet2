package tp5.entites;

import tp6.entites.ISurface;

/**
 * Classe Maison
 * 
 * @author Patrice
 *
 */
public class Maison implements ISurface {
	/**
	 * Tableau des pièces
	 */
	private Piece[] tabPiece = new Piece[0];

	/**
	 * Ajout de pièce dans la maison
	 * 
	 * @param piece
	 */
	public void ajouterPiece(Piece piece) {
		Piece[] tabPieceTmp = new Piece[tabPiece.length + 1];
		for (int i = 0; i < tabPiece.length; i++) {
			tabPieceTmp[i] = tabPiece[i];
		}
		tabPieceTmp[tabPieceTmp.length - 1] = piece;
		tabPiece = tabPieceTmp;
	}

	/**
	 * Récupération de la superficie totale de la maison
	 * 
	 * @return
	 */
	public double calculerSurface() {
		double superficie = 0.0;
		for (int i = 0; i < tabPiece.length; i++) {
			superficie += tabPiece[i].getSuperficie();
		}
		return superficie;
	}

	/**
	 * Récupération de la superficie d'un étage
	 * 
	 * @param etage
	 * @return
	 */
	public double getSuperficieTotaleParEtage(int etage) {
		double superficie = 0.0;
		for (int i = 0; i < tabPiece.length; i++) {
			if (etage == tabPiece[i].getNumeroEtage()) {
				superficie += tabPiece[i].getSuperficie();
			}
		}
		return superficie;
	}

	/**
	 * Récupère la superficie par type de pièce
	 * 
	 * @param type
	 * @return
	 */
	public double getSuperficieParTypePiece(String type) {
		double superficie = 0.0;
		for (int i = 0; i < tabPiece.length; i++) {
			if (type.equals(tabPiece[i].getClass().getSimpleName())) {
				superficie += tabPiece[i].getSuperficie();
			}
		}
		return superficie;
	}

	/**
	 * Récupère le nombre de pièces par type
	 * 
	 * @param type
	 * @return
	 */
	public int getNbPiecesParTypePiece(String type) {
		int nbPiece = 0;
		for (int i = 0; i < tabPiece.length; i++) {
			if (type.equals(tabPiece[i].getClass().getSimpleName())) {
				nbPiece++;
			}
		}
		return nbPiece;

	}

	public Piece[] getTabPiece() {
		return tabPiece;
	}

	public void setTabPiece(Piece[] tabPiece) {
		this.tabPiece = tabPiece;
	}

}
