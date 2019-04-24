package fr.diginamic.essais;

import fr.diginamic.utils.IncrementerValeur;

public class TestIncrementerValeur {

	public static void main(String[] args) {
		int param = 0;
		param = IncrementerValeur.inc(param);
		System.out.println("Param incrémenté par retour de valeur dans test : " + param);
	}

}
