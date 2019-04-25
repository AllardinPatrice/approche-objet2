package tp5.entites;

public class Troll extends Creature {

	/**
	 * Constructeur de troll
	 */
	public Troll() {
		this.force = (int) (Math.random() * 9) + 12; // de 12 à 20
		this.pointsDeVie = (int) (Math.random() * 11) + 20; // de 20 à 30

	}

}
