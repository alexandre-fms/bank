package fr.fms.bank;

public class SavingAccount extends Account {
	double interestRate;

	public SavingAccount(double interestRate, Customer customer) {
		super(customer);
		setInterestRate(interestRate);
	}


	private void setInterestRate(double interestRate2) {
		this.interestRate = interestRate2;

	}


	public void setCurrentAmount(int amount) {
		super.setCurrentAmount(amount);		
	}

	public void applyInterest() {
		super.setCurrentAmount(super.getCurrentAmount() + (super.getCurrentAmount() * interestRate));
	}

	public void addMoney(double amount) {

	}

	public void removeMoney(double amount) {
		if ((super.getCurrentAmount() - amount) > 0) {
			super.setCurrentAmount(super.getCurrentAmount() - amount);
		} 
		else System.out.println("vous avez dépassé vos capacités de retrait !");
	}


	@Override
	public String toString() {
		return "Saving Account:" + super.toString() + ", rate="+interestRate;
	}
}