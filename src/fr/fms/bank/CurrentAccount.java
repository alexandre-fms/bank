package fr.fms.bank;

public class CurrentAccount extends Account {
	double overdraft;

	public CurrentAccount(double overdraft, Customer customer) {
		super(customer);
		setOverdraft(overdraft);
	}


	private void setOverdraft(double amount) {
		this.overdraft = amount;
	}


	public void setCurrentAmount(int amount) {
		if (amount == Math.abs(amount))
			super.setCurrentAmount(super.getCurrentAmount() + amount);
		else {
			if ((super.getCurrentAmount() - amount) > -Math.abs(overdraft))
				super.setCurrentAmount(super.getCurrentAmount() - amount);
			else System.out.println("Vous n'avez pas assez d'argent sur votre compte");
		}
	}


	@Override
	public String toString() {
		return "Current Account " + super.toString() + "overdraft=" + overdraft;
	}
}
