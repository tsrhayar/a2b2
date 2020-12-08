package ex2;

public class main {

	public static void main(String[] args) {
		
		Article a1 =  new Article("Article 1", 300);
		Article a2 =  new Article("Article 2", 400);
		ArticleEnSolde a3 = new ArticleEnSolde("Article 3", 300, 30);
		a1.afficher(a1);
		a2.afficher(a2);
		a3.afficher(a3);

	}

}
