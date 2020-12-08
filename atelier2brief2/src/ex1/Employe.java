package ex1;

import java.time.Year;

public class Employe {

	int thisYear = Year.now().getValue();
	String nom, prenom, adress;
	int anneeNaissance;

	public Employe(String nom, String prenom, String adress, int anneeNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
		this.anneeNaissance = anneeNaissance;
	}

	public int calculerAge(Employe employe) {
		int age = this.thisYear - this.anneeNaissance;
		return age;
	}

	public void afficherInfosClient(Employe employe) {
		int age = calculerAge(employe);
		System.out.println(this.nom + " " + this.prenom + ", né le " + this.anneeNaissance + " habitant à " + this.adress
				+ ", " + age + " ans.");
	}

}
