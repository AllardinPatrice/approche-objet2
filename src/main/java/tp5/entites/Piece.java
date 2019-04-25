package tp5.entites;

/**
 * Pièce de la maison
 * 
 * @author Patrice
 *
 */
public abstract class Piece {
	private double superficie;
	private int numeroEtage;

	/**
	 * Constructeur de pièce
	 * 
	 * @param superficie
	 * @param numeroEtage
	 */
	public Piece(double superficie, int numeroEtage) {
		this.superficie = superficie;
		this.numeroEtage = numeroEtage;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getNumeroEtage() {
		return numeroEtage;
	}

	public void setNumeroEtage(int numeroEtage) {
		this.numeroEtage = numeroEtage;
	}

}
