package ex2;


/**
 * Type Compte Courant
 * @author denis
 * @param solde
 * @param decouvert
 *
 */
public class CompteCourant extends CompteBancaire {
	
	/**
	 * @param solde
	 * @param decouvert
	 */
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;

	public CompteCourant(double solde, double decouvert) {
		super(solde, "CC");
		this.decouvert = decouvert;
	}

	@Override
	public void debiterMontant(double montant) {
		if (this.solde - montant > decouvert) {
			this.solde = solde - montant;
		}
	}

	/**
	 * Getter for decouvert
	 * 
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter
	 * 
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

}
