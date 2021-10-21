import java.util.List;

public class Secteur {
	
	typeAnimal typeAnimauxDansSecteure;
	
	
	List<Animal> animauxDansSecteur;
	
	
	
	
	
	
	public Secteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Secteur(typeAnimal typeAnimauxDansSecteure, List<Animal> animauxDansSecteur) {
		super();
		this.typeAnimauxDansSecteure = typeAnimauxDansSecteure;
		this.animauxDansSecteur = animauxDansSecteur;
	}
	
	public Secteur (typeAnimal typeAnimauxDansSecteure) {
		super();
		this.typeAnimauxDansSecteure = typeAnimauxDansSecteure;
		
	}



	void ajouterAnimal(Animal A) {
		this.animauxDansSecteur.add(A);
		System.out.println("Animal ajouter");
		
	};
	
	int getNombreAnimaux() {
		
		
		return this.animauxDansSecteur.size();
	};

	typeAnimal obtenirType() {
		
		return this.typeAnimauxDansSecteure;
	}
}
