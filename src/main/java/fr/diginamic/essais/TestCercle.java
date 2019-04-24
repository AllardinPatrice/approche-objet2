package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;
import fr.diginamic.utils.CercleService;

public class TestCercle {

	public static void main(String[] args) {
		Cercle c1 = new Cercle(5.0);
		Cercle c2 = new Cercle(7.5);
		System.out.println("Périmètre c1 : " + c1.perimetreCercle());
		System.out.println("Surface c1 : " + c1.surfaceCercle());
		System.out.println("Périmètre c2 : " + c2.perimetreCercle());
		System.out.println("Surface c2 : " + c2.surfaceCercle());

		Cercle c3 = CercleFactory.creerCercle(2.5);
		System.out.println("Périmètre c3 : " + c3.perimetreCercle());
		System.out.println("Surface c3 : " + c3.surfaceCercle());

		Cercle c4 = new Cercle(10);
		CercleService.doubler(c4);
		System.out.println("Rayon cercle doublé par référence (pas besoin de return) : " + c4.getRayon());

	}

}
