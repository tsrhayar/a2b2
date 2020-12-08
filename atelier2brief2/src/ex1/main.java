package ex1;

public class main {

	public static void main(String[] args) {

		Employe p1 = new Employe("Kaddi", "Ismail", "Agadir", 1995);
		Employe p2 = new Employe("Srhayar", "Taha", "Safi", 1996);
		Employe p3 = new Employe("Srhayar", "Youness", "Safi", 1999);
		p1.afficherInfosClient(p1);
		p2.afficherInfosClient(p2);
		p3.afficherInfosClient(p3);

	}

}
