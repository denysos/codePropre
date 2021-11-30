package ex3conseil;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {

	protected List<Animal> listeDesAnimaux = new ArrayList<>();

	public void addAnimal(String nom, Animaux espece) {
		listeDesAnimaux.add(new Animal(nom, espece));
	}

	public void afficherListeAnimaux() {

		for (Animal animal : listeDesAnimaux) {
			System.out.println(animal);
		}

	}
	
	public int compterAnimaux(){
		return listeDesAnimaux.size();
	}

	public abstract double calculerKgsNourritureParJour();

}
