package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne c1 = new CalculMoyenne(/* 2 */);
		c1.ajout(1);
		c1.ajout(2);
		System.out.println("Moyenne : " + c1.calcul());

		CalculMoyenne c2 = new CalculMoyenne(/* 8 */);
		c2.ajout(1);
		c2.ajout(2);
		c2.ajout(3);
		c2.ajout(4);
		c2.ajout(5);
		c2.ajout(6);
		c2.ajout(7);
		c2.ajout(8);
		System.out.println("Moyenne : " + c2.calcul());

		CalculMoyenne c3 = new CalculMoyenne(/*-1*/);

		CalculMoyenne c4 = new CalculMoyenne(/* 2 */);
		c4.ajout(1);
		c4.ajout(2);
		c4.ajout(3);
		System.out.println("Moyenne : " + c4.calcul());
	}

}
