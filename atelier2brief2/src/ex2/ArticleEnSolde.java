package ex2;

public class ArticleEnSolde extends Article {

	protected int pourcentage;

	public ArticleEnSolde(String name, int price, int pourcentage) {
		super(name, price);
		this.pourcentage = pourcentage;
	}

	public void afficher(ArticleEnSolde articleEnSolde) {
		int salePrice = getPrice() - (getPrice() * pourcentage / 100);
		System.out.println("Le prix de aprés solde de " + this.getName() + " est: " + salePrice + " DH");
	}

}
