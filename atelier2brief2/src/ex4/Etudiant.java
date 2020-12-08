package ex4;

public class Etudiant extends Personne {

	String diplome;

	public Etudiant(String nom, String prenom, String adresse, String ville, int dateNaissance, String diplome) {
		super(nom, prenom, adresse, ville, dateNaissance);

		this.diplome = diplome;

	}

	@Override
	public String toString() {
		return "Etudiant [diplome=" + diplome + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse
				+ ", ville=" + ville + ", dateNaissance=" + dateNaissance + "]";
	}

}
