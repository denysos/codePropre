package ex3conseil;

public class ZoneCarnivore extends Zone {
	public double calculerKgsNourritureParJour() {
		return listeDesAnimaux.size() * 10;
	}
}
