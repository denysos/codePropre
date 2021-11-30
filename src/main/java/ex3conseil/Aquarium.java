package ex3conseil;

import java.util.ArrayList;
import java.util.List;

public class Aquarium extends Zone {
	public double calculerKgsNourritureParJour() {
		return listeDesAnimaux.size() * 0.2;
	}
}
