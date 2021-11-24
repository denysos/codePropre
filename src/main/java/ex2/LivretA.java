package ex2;

/**
 * code bancaire de type compte Livret A
 * 
 * @author denis
 *
 */
public class LivretA extends CompteBancaire {
	
	/**
	 * @param solde
	 * @param tauxRemuneration
	 */
	
	private double tauxRemuneration;

	public LivretA(double solde, double tauxRemuneration) {
		super(solde, "LA");
		this.tauxRemuneration = tauxRemuneration;
	}

	public void appliquerRemuAnnuelle() {
		this.solde = solde + solde * tauxRemuneration / 100;

	}

	public void debiterMontant(double montant) {
		if (this.solde - montant > 0) {
			this.solde = solde - montant;
		}

	}

	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
