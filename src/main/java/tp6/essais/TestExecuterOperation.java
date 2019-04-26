package tp6.essais;

import tp6.entites.Addition;
import tp6.entites.ExecuterOperation;
import tp6.entites.Multiplication;

/**
 * Test des opérations liées à l'interface de calcul d'addition et de
 * multiplication
 * 
 * @author Patrice
 *
 */
public class TestExecuterOperation {

	public static void main(String[] args) {

		/**
		 * Création d'une interface
		 */
		ExecuterOperation eo = new ExecuterOperation();

		/**
		 * Création d'une addition et affichage
		 */
		Addition a1 = new Addition();
		System.out.println("Addition 5+8 : " + eo.execute(a1, 5, 8));

		/**
		 * Création d'une multiplication et affichage
		 */
		Multiplication m1 = new Multiplication();
		System.out.println("Multiplication 5*8 : " + eo.execute(m1, 5, 8));

	}

}
