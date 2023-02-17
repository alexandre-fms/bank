package fr.fms.bank;
/**
 * 
 * @author GuyauN,ChevinA,ArenasA,DealbuquerqueD;
 *Permet de creer un compte épargne.
 */
public class SavingAccount extends Account {
	double interestRate;
/**
 * //permet de contruire le compte epargne d'un client;
 * @param interestRate double taux d'interet
 * @param customer client de la banque;
 */
	public SavingAccount(double interestRate, Customer customer) {  
		super(customer);												
		setInterestRate(interestRate);
	}

/**
 * 
 * @param interestRate2  double permet de modifier le taux d'interet d'un compte;
 */
	private void setInterestRate(double interestRate2) {			
		this.interestRate = interestRate2;

	}

/**
 * 
 * @param amount entier permet de modifier le solde  d'un compte;
 */
	public void setCurrentAmount(int amount) {
		super.setCurrentAmount(amount);								
	}

	/**
	 * permet de calculer le gain d'argent d'un compte epargne en fonction du taux.
	 */
	public void applyInterest() {
		super.setCurrentAmount(super.getCurrentAmount() + (super.getCurrentAmount() * interestRate)); 
	}
	/**
	 *  amount entier permet d'ajouter de l'argent a un compte epargne;
	 */
	public void addMoney(double amount) {			

	}
	/**
	 * permet de retirer de l'argent a un compte en verifiant sa capacité de retrait;
	 */
	@Override
	public boolean removeMoney(double amount) {
		if ((super.getCurrentAmount() - amount) > 0) {					
			super.setCurrentAmount(super.getCurrentAmount() - amount);
			return true;
		} 
		else {
			System.out.println("vous avez dépassé vos capacités de retrait !");
			return false;
		}
	}

	/**
	 * affiche les infos d'un compte epargne en lien avec la classe account;
	 */
	@Override
	public String toString() {														
		return "Saving Account:" + super.toString() + ", rate="+interestRate;
	}
}