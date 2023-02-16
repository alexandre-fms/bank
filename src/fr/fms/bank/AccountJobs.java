package fr.fms.bank;

public interface AccountJobs {
	public void withdraw(double amount, Account account);
	public void transfer(double amount, Account accountFrom, Account accountTo);
	public double consult(Account account);
	public void deposit(double amount, Account account);
}
