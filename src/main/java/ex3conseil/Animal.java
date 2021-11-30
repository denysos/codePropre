package ex3conseil;

public class Animal {
	private String nom;
	private String espece;
	private Animaux type;
//	private String comportement;
	
	
	public Animal(String nom, Animaux espece) {
		super();
		this.nom = nom;
		this.type = espece;
	}


	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", espece=" + espece + ", type=" + type + "]";
	}
	

}
