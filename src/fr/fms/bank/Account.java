package fr.fms.bank;

import java.util.Date;

public abstract class Account {
	private static int counter=0;
	private double currentAmount;
	private int ID;
	private Date date;
	private Customer customer;
	//	private String label;


	public Account(Customer customer) {
		counter++;
		setID(counter);
		setCurrentAmount(0);
		this.date = new Date();
		setCustomer(customer);
	}

	private void setCustomer(Customer customer2) {
		this.customer = customer2;

	}

	public double getCurrentAmount() {
		return currentAmount;
	}

	public int getID() {
		return ID;
	}

	public void setCurrentAmount(double currentAmount) {
		this.currentAmount = currentAmount;		
	}

	public void addMoney(double amount) {
		this.currentAmount += amount;
	}

	public void removeMoney(double amount) {

	}

	public void setID(int ID) {
		this.ID = ID;
	}


	public double displayAvailableAmount() {
		return this.currentAmount;
	}

	@Override
	public String toString() {
		return "[ID=" + ID + ", creation date=" + date + ", balance= " + currentAmount + " , "  + customer.toString() + "]";
	}


}