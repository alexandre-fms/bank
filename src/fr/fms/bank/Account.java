package fr.fms.bank;

public abstract class Account {
	private int currentAmount;
	private String ID;
	private String label;
	
	public Account(String ID, String label, int currentAmount) {
		setCurrentAmount(currentAmount);
		setID(ID);
		setLabel(label);	
	}
	
	public int getCurrentAmount() {
		return currentAmount;
	}
	
	public String getID() {
		return ID;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setCurrentAmount(int currentAmount) {
		this.currentAmount = currentAmount;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public int displayAvailableAmount() {
		return this.currentAmount;
	}
	
	@Override
	public String toString() {
		return "Account [ID=" + ID + ", label=" + label + ", currentAmount=" + currentAmount + "]";
	}
	
	
}