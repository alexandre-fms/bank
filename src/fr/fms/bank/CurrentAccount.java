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


	public void setCurrentAmount(double amount) {
		super.setCurrentAmount(amount);
	}
	
	
	public void removeMoney(double amount) {
		if ((super.getCurrentAmount() - amount) > -overdraft) {
			super.setCurrentAmount(super.getCurrentAmount() - amount);
		} 
		else System.out.println("vous avez dépassé vos capacités de retrait !");
	}

	
	@Override
	public String toString() {
		return "Current Account " + super.toString() + "overdraft=" + overdraft;
	}
}
