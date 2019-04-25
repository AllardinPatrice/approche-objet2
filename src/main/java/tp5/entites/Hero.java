package tp5.entites;

public class Hero extends Personnage {
	int score = 0;

	/**
	 * Constructeur qui hérite du personnage
	 * 
	 * @param force
	 * @param pointsDeVie
	 * @param score
	 */
	public Hero() {
		this.force = (int) (Math.random() * 7) + 12; // de 12 à 18
		this.pointsDeVie = (int) (Math.random() * 31) + 20; // de 20 à 50
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
