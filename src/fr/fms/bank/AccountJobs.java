package fr.fms.bank;

public interface AccountJobs {
	
	public void transfer(double amount, Account accountFrom, Account accountTo);
	public String consult(Account account);
	public void deposit(double amount, Account account);
	
	public void withdraw(double amount, Account account);
}
