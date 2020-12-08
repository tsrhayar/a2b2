package ex3;

public class CompteBancaire {

	protected long accountNumber;
	protected double solde;

	public CompteBancaire(long accountNumber, double solde) {
		this.accountNumber = accountNumber;
		this.solde = solde >= 200 ? solde : 200;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public double Ajouter(int ajoute) {
		solde = solde + ajoute;
		System.out.println(ajoute + " DH a été ajoutée");
		return solde;
	}

	public double Retirer(int retire) {
		if (this.solde - retire >= 200) {
			solde = solde - retire;
			System.out.println(retire + " DH a été retirée");
			return solde;
		} else {
			System.out.println("Echec: Solde ne peut pas être moins de 200 DH!");
			return this.solde;
		}
	}

	public void Afficher() {
		System.out.println("N° Compte: " + accountNumber + ", Solde: " + solde + " DH");
	}

}
