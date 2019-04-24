package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleService {
	Cercle c1;

	public static void doubler(Cercle c1) {
		c1.setRayon(c1.getRayon() * 2);
	}
}
