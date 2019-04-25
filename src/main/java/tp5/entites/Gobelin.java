package tp5.entites;

public class Gobelin extends Creature {

	/**
	 * Constructeur de gobelin
	 */
	public Gobelin() {
		this.force = (int) (Math.random() * 6) + 7; // de 7 à 12
		this.pointsDeVie = (int) (Math.random() * 6) + 10; // de 10 à 15
	}

}
