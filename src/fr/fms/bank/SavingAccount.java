package fr.fms.bank;

public class SavingAccount extends Account {
	double interestRate;
	
	public SavingAccount(String ID, String label, int amount) {
		super(ID, label, amount);
	}
	
	
	public void setCurrentAmount(int amount) {
		if (amount == Math.abs(amount))
			super.setCurrentAmount(super.getCurrentAmount() + amount);
		else {
			if ((super.getCurrentAmount() - amount) > 0)
				super.setCurrentAmount(super.getCurrentAmount() - amount);
			else System.out.println("Il n'y a pas assez d'argent sur le compte");
		}			
	}
	
	public void applyInterest() {
		super.setCurrentAmount(super.getCurrentAmount() + (super.getCurrentAmount() * interestRate));
	}
	
	
	@Override
	public String toString() {
		return "Détails du compte épargne: [ID=" + super.getID() + ", label=" + super.getLabel() + ", currentAmount=" + super.getCurrentAmount() + "]";
	}
}