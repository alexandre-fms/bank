package fr.fms.bank;

import java.util.Date;

public abstract class Operation {
	private int id;
	private double amount;
	private Date date;
	private static int counter = 0;
	
	public Operation(double amount) {

		counter++;
		setId(counter);
		this.amount = amount;
		this.date = new Date();
		
	}
	
	static int getCounter() {
		return counter;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	
	@Override
	public String toString() {
		return "[amount=" + amount +", "+"date=" + date +"]";
	}
	
	
}
