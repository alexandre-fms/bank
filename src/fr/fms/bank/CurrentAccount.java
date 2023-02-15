package fr.fms.bank;

public class CurrentAccount extends Account {
	double decouvertAmount;

	public CurrentAccount(String ID, String label, int amount) {
		super(ID, label, amount);
	}


	public void setCurrentAmount(int amount) {
		if (amount == Math.abs(amount))
			super.setCurrentAmount(super.getCurrentAmount() + amount);
		else {
			if ((super.getCurrentAmount() - amount) > -Math.abs(decouvertAmount))
				super.setCurrentAmount(super.getCurrentAmount() - amount);
			else System.out.println("Vous n'avez pas assez d'argent sur votre compte");
		}
	}


	@Override
	public String toString() {
		return "Détails du compte courant: [ID=" + super.getID() + ", label=" + super.getLabel() + ", currentAmount=" + super.getCurrentAmount() + "]";
	}
}
