package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A
 * (type=LA)
 * 
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {
	
	/**
	 * @param solde
	 * @param type
	 */

	/** solde : solde du compte */
	protected double solde;

	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	protected String type;



	public CompteBancaire() {
		super();
//		this.solde = solde;
//		this.type = type;
	}
	
	

	public CompteBancaire(double solde, String type) {
		super();
		this.solde = solde;
		this.type = type;
	}



	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	public final void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	public abstract void debiterMontant(double montant);



	/**
	 * Getter for solde
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter
	 * 
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter for type
	 * 
	 * @return the type
	 */
	public String getType() {
		return type;
	}

}
