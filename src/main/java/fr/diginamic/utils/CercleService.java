package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleService {
	private Cercle c1;

	public static void doubler(Cercle c1) {
		c1.setRayon(c1.getRayon() * 2);
	}

	public Cercle getC1() {
		return c1;
	}

	public void setC1(Cercle c1) {
		this.c1 = c1;
	}
}
