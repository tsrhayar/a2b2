package ex4;

public class Personne {

	String nom;
	String prenom;
	String adresse;
	String ville;
	int dateNaissance;

	public Personne(String nom, String prenom, String adresse, String ville, int dateNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ville = ville;
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", ville=" + ville
				+ ", dateNaissance=" + dateNaissance + "]";
	}

}
