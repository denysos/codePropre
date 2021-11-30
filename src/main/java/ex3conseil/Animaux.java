package ex3conseil;

public enum Animaux {
	GAZELLE("Gazelle", "MAMMIFERE", "HERBIVORE"), ZEBRE("Zèbre", "MAMIFERE", "HERBIVORE"),
	LION("Lion", "MAMMIFERE", "HERBIVORE"), PANTHERE("Panthère", "MAMMIFERE", "CARNIVORE"),
	REQUINBLANC("Requin blanc", "POISSON", "HERBIVORE"), TRUITEDOREE("Truite dorée", "POISSON", "HERBIVORE"),
	BOACONSTRICTOR("Boa constrictor", "SERPENT", "CARNIVORE"), PYTHON("Python", "SERPENT", "CARNIVORE");

	private String espece;
	private String type;
	private String comportement;

	private Animaux(String espece, String type, String comportement) {
		this.espece = espece;
		this.type = type;
		this.comportement = comportement;
	}

}
