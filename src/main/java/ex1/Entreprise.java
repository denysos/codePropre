package ex1;

import java.util.Date;
/**
 * Type Entreprise
 * @author denis
 *
 */
public class Entreprise {

	//siret
	public int siret;
	
	//nom de l'entreprise = raison sociale
	public String nom;
	
	//adresse postale
	public String adresse;
	
	//date de creation
	public Date dateCreation;
	
	//capital max pour le statut xxxx
	public static final int CAPITAL_MAX = 3_000_000;
	
	
	/**
	 * affichage du statut de l'entreprise
	 */
	public void afficherStatut(){
		
	}
	
}
