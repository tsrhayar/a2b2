package ex4;

public class Enseignant extends Personne {

	String specialite;

	public Enseignant(String nom, String prenom, String adresse, String ville, int dateNaissance, String specialite) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return "Enseignant [specialite=" + specialite + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse
				+ ", ville=" + ville + ", dateNaissance=" + dateNaissance + "]";
	}

}
