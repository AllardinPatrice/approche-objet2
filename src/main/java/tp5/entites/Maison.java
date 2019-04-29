package tp5.entites;

import java.util.ArrayList;

import tp6.entites.ISurface;

/**
 * Classe Maison Mise en commentaire de tous les éléments inutiles en utilisant
 * un ArrayList
 * 
 * @author Patrice
 *
 */
public class Maison implements ISurface {
	/**
	 * Liste des pièces
	 */
	// private Piece[] tabPiece = new Piece[0];
	private ArrayList<Piece> alp;

	/**
	 * Ajout de pièce dans la maison
	 * 
	 * @param piece
	 */
	public void ajouterPiece(Piece piece) {
		// Piece[] tabPieceTmp = new Piece[tabPiece.length + 1];
		// for (int i = 0; i < tabPiece.length; i++) {
		// tabPieceTmp[i] = tabPiece[i];
		// }
		// tabPieceTmp[tabPieceTmp.length - 1] = piece;
		// tabPiece = tabPieceTmp;
		alp.add(piece);
	}

	/**
	 * Récupération de la superficie totale de la maison
	 * 
	 * @return
	 */
	public double calculerSurface() {
		double superficie = 0.0;
		// for (int i = 0; i < tabPiece.length; i++) {
		for (int i = 0; i < alp.size(); i++) {
			// superficie += tabPiece[i].getSuperficie();
			superficie += alp.get(i).getSuperficie();
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
		// for (int i = 0; i < tabPiece.length; i++) {
		for (int i = 0; i < alp.size(); i++) {
			// if (etage == tabPiece[i].getNumeroEtage()) {
			if (etage == alp.get(i).getNumeroEtage()) {
				// superficie += tabPiece[i].getSuperficie();
				superficie += alp.get(i).getSuperficie();
			}
		}
		return superficie;
	}

	/**
	 * Constructeur de maison
	 * 
	 */
	public Maison() {
		alp = new ArrayList<Piece>();
	}

	/**
	 * Récupère la superficie par type de pièce
	 * 
	 * @param type
	 * @return
	 */
	public double getSuperficieParTypePiece(String type) {
		double superficie = 0.0;
		// for (int i = 0; i < tabPiece.length; i++) {
		for (int i = 0; i < alp.size(); i++) {
			// if (type.equals(tabPiece[i].getClass().getSimpleName())) {
			if (type.equals(alp.get(i).getClass().getSimpleName())) {
				// superficie += tabPiece[i].getSuperficie();
				superficie += alp.get(i).getSuperficie();
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
		// for (int i = 0; i < tabPiece.length; i++) {
		for (int i = 0; i < alp.size(); i++) {
			// if (type.equals(tabPiece[i].getClass().getSimpleName())) {
			if (type.equals(alp.get(i).getClass().getSimpleName())) {
				nbPiece++;
			}
		}
		return nbPiece;

	}

	// public Piece[] getTabPiece() {
	// return tabPiece;
	// }

	// public void setTabPiece(Piece[] tabPiece) {
	// this.tabPiece = tabPiece;
	// }

}
