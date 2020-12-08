package ex3;

import java.util.Random;

public class main {

	static Random r = new Random();

	public static void main(String[] args) {

		CompteBancaire c1 = new CompteBancaire(Math.abs(r.nextLong()), 20);

		c1.Afficher();
		c1.Ajouter(300);
		c1.Afficher();
		c1.Retirer(310);
		c1.Afficher();

	}

}
