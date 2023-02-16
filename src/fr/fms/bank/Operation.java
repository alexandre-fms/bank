package fr.fms.bank;


public abstract class Operation {
	private int id;
	private double amount;
	private String date;
	public Operation(int id, double amount, String date) {
		this.id = id;
		this.amount = amount;
		this.date = date;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Operation [id=" + id + ", amount=" + amount +", "+date+"]";
	}
	
	
}
