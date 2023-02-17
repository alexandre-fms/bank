package fr.fms.bank;

/**
 * 
 * @author GuyauN,ChevinA,ArenasA,DealbuquerqueD;
 *donne le montant  du transfer entre un compte et un autre.
 */
public class Transfer extends Operation{
	public Transfer(double amount, int accountID) {
		super(amount, accountID);						//
	}
	/**
	 * Affiche les details d'un transfer.
	 */
	@Override
	public String toString() {
		return "Virement " + super.toString();
	}
	
}
