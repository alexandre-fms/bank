package fr.fms.bank;



public class Withdraw extends Operation{
	
	public Withdraw(double amount) {
		super(amount);
	}

	@Override
	public String toString() {
		return "Détail du Retrait " + super.toString();
	}
	
	
}
