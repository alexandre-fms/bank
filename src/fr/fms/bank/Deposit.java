package fr.fms.bank;

/**
 * La classe Deposit hérite de la classe Operation
 * @author ArenasA ChevinA DeAlbuquerqueD GuyauN
 *
 */
public class Deposit extends Operation{
	/**
	 * Constructeur permettant de créer une opération de dépôt
	 * @param amount	double Le montant à ajouter à un compte
	 */
	public Deposit(double amount, int accountID) {
		super(amount, accountID);
	}
	/**
	 * Méthode d'affichage
	 * @return String une chaine de caractère à afficher.
	 */
	@Override
	public String toString() {
		return "Dépôt " + super.toString();
	}
	
}
