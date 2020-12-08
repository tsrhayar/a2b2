package ex4;

public class Secretaire extends Personne {
	
	int numeroBureau;

	public Secretaire(String nom, String prenom, String adresse, String ville, int dateNaissance, int numeroBureau) {
		super(nom, prenom, adresse, ville, dateNaissance);
		
		this.numeroBureau = numeroBureau;
		
	}

	@Override
	public String toString() {
		return "Secretaire [numeroBureau=" + numeroBureau + ", nom=" + nom + ", prenom=" + prenom + ", adresse="
				+ adresse + ", ville=" + ville + ", dateNaissance=" + dateNaissance + "]";
	}
	
}
