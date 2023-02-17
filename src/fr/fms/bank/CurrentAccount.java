package fr.fms.bank;
/**
 * La classe CurrentAccount héritant de la classe Account définit la création d'un compte courant
 * ayant la particularité d'avoir un découvert autorisé
 * @author ArenasA ChevinA DeAlbuquerqueD GuyauN
 *
 */
public class CurrentAccount extends Account {
	double overdraft;
	/**
	 * constructeur permettant de créer un compte pour un client associé
	 * @param overdraft double montant du découvert autorisé
	 * @param customer object Customer à qui sera associé le compte
	 */
	public CurrentAccount(double overdraft, Customer customer) {
		super(customer);
		setOverdraft(overdraft);
	}

	/**
	 * Méthode permettant de modfier le montant du découvert autorisé
	 * @param amount double montant du découvert à modifier
	 */
	private void setOverdraft(double amount) {
		this.overdraft = amount;
	}

	/**
	 * Méthode permettant de modifier la somme actuelle du compte courant
	 * @param amount	double montant total du compte
	 */
	public void setCurrentAmount(double amount) {
		super.setCurrentAmount(amount);
	}
	
	/**
	 * cette méthode sert à soustraire un montant au total du compte
	 */
	@Override
	public boolean removeMoney(double amount) {
		if ((super.getCurrentAmount() - amount) > -overdraft) {
			super.setCurrentAmount(super.getCurrentAmount() - amount);
			return true;
		} 
		else {
			System.out.println("vous avez dépassé vos capacités de retrait !");
			return false;
		}
	}

	/**
	 * Méthode d'affichage
	 */
	@Override
	public String toString() {
		return "Current Account " + super.toString() + "overdraft=" + overdraft;
	}
}
