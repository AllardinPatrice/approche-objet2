package tp5.entites;

public class Loup extends Creature {

	/**
	 * Constructeur de loup
	 * 
	 */
	public Loup() {
		this.force = (int) (Math.random() * 6) + 5; // de 5 à 10
		this.pointsDeVie = (int) (Math.random() * 6) + 5; // de 5 à 10
	}

}
