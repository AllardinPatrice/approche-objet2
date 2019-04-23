package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {
	public static Cercle creerCercle(double param) {
		Cercle c1 = new Cercle(param);
		return c1;
	}
}
