package fr.fms.bank;

public abstract class Account {
	private double currentAmount;
	private String ID;
	private String label;
	
	public Account(String ID, String label, double currentAmount) {
		setCurrentAmount(currentAmount);
		setID(ID);
		setLabel(label);	
	}
	
	public double getCurrentAmount() {
		return currentAmount;
	}
	
	public String getID() {
		return ID;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setCurrentAmount(double currentAmount) {
		this.currentAmount = currentAmount;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public double displayAvailableAmount() {
		return this.currentAmount;
	}
	
	@Override
	public String toString() {
		return "Account [ID=" + ID + ", label=" + label + ", currentAmount=" + currentAmount + "]";
	}
	
	
}