package fr.fms.bank;


public class Deposit extends Operation{
	public Deposit(double amount) {
		super(amount);
	}
	@Override
	public String toString() {
		return "Détail du dépôt " + super.toString();
	}
	
}
