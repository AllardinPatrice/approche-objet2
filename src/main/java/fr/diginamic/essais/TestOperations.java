package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		System.out.println("Addition : " + Operations.calcul(1, 2, '+'));
		System.out.println("Soustraction : " + Operations.calcul(1, 2, '-'));
		System.out.println("Multiplication : " + Operations.calcul(1, 2, '*'));
		System.out.println("Division : " + Operations.calcul(1, 2, '/'));
	}

}
