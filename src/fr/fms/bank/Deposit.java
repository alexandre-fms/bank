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
	public Deposit(double amount) {
		super(amount);
	}
	/**
	 * Méthode d'affichage
	 * @return String une chaine de caractère à afficher.
	 */
	@Override
	public String toString() {
		return "Détail du dépôt " + super.toString();
	}
	
}
