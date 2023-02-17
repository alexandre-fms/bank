package fr.fms.bank;

/**
 * 
 * @author GuyauN,ChevinA,ArenasA,DealbuquerqueD;
 *	donne le montant du retrait dans un compte;
 */

public class Withdraw extends Operation{
	
	public Withdraw(double amount) {		
		super(amount);
	}
/**
 * Affiche les détails d'un retrait sur un compte.
 */
	@Override
	public String toString() {
		return "Détail du Retrait " + super.toString();
	}
	
	
}
