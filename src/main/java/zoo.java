import java.util.List;

public class zoo {
	
	int visiteur;
	List <Secteur> secteursAnimaux;
	
	
	
	
	
	public zoo() {
		super();
		visiteur =0;
		// TODO Auto-generated constructor stub
	}

	public zoo(int visiteur, List<Secteur> secteursAnimaux) {
		super();
		this.visiteur = visiteur;
		this.secteursAnimaux = secteursAnimaux;
	}

	void ajouterSecteur(typeAnimal t) {
		this.secteursAnimaux.add(new Secteur(t));
		
	}
	
	void nouveauVisiteur() throws LimiteVisiteurException {
		if (visiteur <= this.getLimiteVisiteur()) {
			visiteur += 1;
		}
		else {
			throw new LimiteVisiteurException("Nombre de visiteur max atteint");
		}
		
		
	}
	
	int getLimiteVisiteur() {
		
		return 15;
		
	}
	
	void nouvelAnimal(Animal A) {
		for (int i =0; i< this.secteursAnimaux.size(); i++)
		{
			if (this.secteursAnimaux.get(i).typeAnimauxDansSecteure == A.type) {
				this.secteursAnimaux.get(i).ajouterAnimal(A);
			}
		
		}
		
	}
	
	int nombreAnimaux() {
		int compteur = 0;
		
		for (int i =0; i< this.secteursAnimaux.size(); i++)
		{
			compteur += this.secteursAnimaux.get(i).getNombreAnimaux();
		}
		
		return compteur;
	}
	

}
