package fr.fms.bank;


public class Transfer extends Operation{
	public Transfer(double amount) {
		super(amount);
	}
	@Override
	public String toString() {
		return "Détail du transfert " + super.toString();
	}
	
}
